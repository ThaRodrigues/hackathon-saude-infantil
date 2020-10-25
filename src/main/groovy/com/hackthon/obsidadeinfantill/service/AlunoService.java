package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.Aluno;
import com.hackthon.obsidadeinfantill.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Collection<Aluno> buscarTodos(){
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarAluno(String uuid){
        return alunoRepository.findByUuid(UUID.fromString(uuid));
    }

    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Collection<Aluno> salvar(Collection<Aluno> alunos){
        return alunoRepository.saveAll(alunos);
    }
}