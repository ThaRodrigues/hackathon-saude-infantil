package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Escola.Reitor;
import com.hackthon.obsidadeinfantill.repository.ReitorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReitorService {

    private final ReitorRepository reitorRepository;

    public ReitorService(ReitorRepository reitorRepository) {
        this.reitorRepository = reitorRepository;
    }

    public Reitor criar(Reitor reitor){
        return reitorRepository.save(reitor);
    }

    public Optional<Reitor> buscarPorId(Long id){
        return reitorRepository.findById(id);
    }
}