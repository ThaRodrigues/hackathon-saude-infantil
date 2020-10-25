package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.Escola.Reitor;
import com.hackthon.obsidadeinfantill.service.ReitorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reitor")
public class ReitorController {

    private ReitorService reitorService;

    public ReitorController(ReitorService reitorService) {
        this.reitorService = reitorService;
    }

    @PostMapping
    public Reitor criar(@RequestBody Reitor reitor){
        return reitorService.criar(reitor);
    }
}