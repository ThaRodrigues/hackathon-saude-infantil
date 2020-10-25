package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.Escola.Escola;
import com.hackthon.obsidadeinfantill.service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/escola")
public class EscolaController {

    private EscolaService escolaService;

    public EscolaController(EscolaService escolaService) {
        this.escolaService = escolaService;
    }

    @PostMapping
    public Escola criar(@RequestBody Escola escola){
        return escolaService.criar(escola);
    }

    @GetMapping
    public Collection<Escola> listagem(){
        return escolaService.buscarTodos();
    }
}