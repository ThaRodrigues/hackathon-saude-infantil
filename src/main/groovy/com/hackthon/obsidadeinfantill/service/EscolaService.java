package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Escola.Escola;
import com.hackthon.obsidadeinfantill.repository.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EscolaService {

    private final EscolaRepository escolaRepository;

    public EscolaService(EscolaRepository escolaRepository) {
        this.escolaRepository = escolaRepository;
    }

    public Escola criar(Escola escola){
        return escolaRepository.save(escola);
    }

    public Optional<Escola> buscarPorId(Long id){
        return escolaRepository.findById(id);
    }

    public Collection<Escola> buscarTodos(){
        return escolaRepository.findAll();
    }
}