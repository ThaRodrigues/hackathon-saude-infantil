package com.hackthon.obsidadeinfantill.domain;

import java.math.BigDecimal;
import java.util.UUID;

// TODO - incluir annotations para JPA
public class Aluno {

    private UUID uuid;
    private String nome;
    private BigDecimal altura;
    private BigDecimal peso;
    private Long idEscola;


    public Aluno(String [] texto) {
        this.uuid =  UUID.randomUUID();
        this.nome = texto[0];
        this.altura = new BigDecimal(texto[1]);
        this.peso = new BigDecimal(texto[2]);
    }

    public Long getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Long idEscola) {
        this.idEscola = idEscola;
    }

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
}
