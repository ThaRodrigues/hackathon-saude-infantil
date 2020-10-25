package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.Agente;
import com.hackthon.obsidadeinfantill.service.AgenteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/agente")
public class AgenteController {

    private AgenteService agenteService;

    public AgenteController(AgenteService agenteService) {
        this.agenteService = agenteService;
    }

    @PostMapping
    public Agente criar(@RequestBody Agente agente){
        return agenteService.salvar(agente);
    }

    @GetMapping
    public Collection<Agente> listagem(){
        return agenteService.buscarTodos();
    }
}