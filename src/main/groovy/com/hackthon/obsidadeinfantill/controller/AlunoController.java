package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.Aluno;
import com.hackthon.obsidadeinfantill.service.AlunoService;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

   // @PostMapping
    // public Aluno criar(@RequestBody Aluno aluno){
    //   return alunoService.salvar(aluno);
    //}


    @PostMapping
    public void teste(@RequestParam("file") MultipartFile file) throws IOException {

        System.out.println(file.getName());

        Reader reader = new InputStreamReader(file.getInputStream());

        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        List<String[]> pessoas = csvReader.readAll();


        for (String[] pessoa : pessoas)
            System.out.println("Name : " + pessoa[0] );



    }
}