package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Aluno;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public Aluno buscarAluno(String uuid){
        return new Aluno();
    }

    public Aluno salvar(Aluno aluno){
        return aluno;
    }
}