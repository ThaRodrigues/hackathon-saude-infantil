package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Escola.Escola;
import org.springframework.stereotype.Service;

@Service
public class EscolaService {

    public Escola criar(Escola escola){
        return new Escola();
    }
}