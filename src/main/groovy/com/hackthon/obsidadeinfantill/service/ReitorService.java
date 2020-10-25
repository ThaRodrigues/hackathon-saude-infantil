package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Escola.Reitor;
import org.springframework.stereotype.Service;

@Service
public class ReitorService {

    public Reitor criar(Reitor reitor){
        return new Reitor();
    }
}