package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Aluno;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlunoService {

    //chamar a repository

    public Aluno buscarAluno(String uuid){
        return new Aluno();
    }

    public Aluno salvar(Aluno aluno){
        return aluno;
    }

    public Aluno salvar(Collection<Aluno> alunos){
        return null;
    }
}