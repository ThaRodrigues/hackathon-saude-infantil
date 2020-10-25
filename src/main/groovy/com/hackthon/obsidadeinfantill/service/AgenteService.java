package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Agente;
import com.hackthon.obsidadeinfantill.repository.AgenteRepository;
import org.springframework.stereotype.Service;

@Service
public class AgenteService {

    private final AgenteRepository agenteRepository;

    public AgenteService(AgenteRepository agenteRepository) {
        this.agenteRepository = agenteRepository;
    }

    public Agente salvar(Agente agente){
        return agenteRepository.save(agente);
    }
}