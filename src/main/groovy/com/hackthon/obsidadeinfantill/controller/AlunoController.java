package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.Aluno;
import com.hackthon.obsidadeinfantill.service.AlunoService;
import com.hackthon.obsidadeinfantill.utils.CsvUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
     public Aluno criar(@RequestBody Aluno aluno){
       return alunoService.salvar(aluno);
    }


    @PostMapping("/importacao")
    public void importacao(@RequestParam("file") MultipartFile file) throws IOException {

        Logger logger = LoggerFactory.getLogger(AlunoController.class);

        Collection<Aluno> alunos = new ArrayList<>();

        Reader reader = new InputStreamReader(file.getInputStream());

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int i = 0;

        br = new BufferedReader(reader);
        while ((line = br.readLine()) != null) {
            if(i == 0){
                i++;
                continue;
            }

            String[] pessoa = line.split(cvsSplitBy);
            List<String> linha = CsvUtils.parseLine(line);
            System.out.println(linha.toString());
        }
    }
}