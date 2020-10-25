package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.Escola.Escola;
import com.hackthon.obsidadeinfantill.service.EscolaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}