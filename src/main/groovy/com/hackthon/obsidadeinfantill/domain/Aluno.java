package com.hackthon.obsidadeinfantill.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

// TODO - incluir annotations para JPA
public class Aluno {

    private UUID uuid;
    private String nome;
    private BigDecimal altura;
    private BigDecimal peso;

    public Aluno(){
        this.uuid =  UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Aluno criar(List<String> campos){

        Aluno aluno = new Aluno();
        aluno.setNome(campos.get(0));
        aluno.setPeso(new BigDecimal(campos.get(1)));
        aluno.setAltura(new BigDecimal(campos.get(2)));

        return aluno;
    }
}
