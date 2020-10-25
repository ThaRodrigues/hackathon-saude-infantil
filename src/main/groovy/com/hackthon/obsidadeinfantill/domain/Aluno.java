package com.hackthon.obsidadeinfantill.domain;

import java.math.BigDecimal;
import java.util.UUID;

// TODO - incluir annotations para JPA
public class Aluno {

    private UUID uuid;
    private String nome;
    private BigDecimal altura;
    private BigDecimal peso;


    public Aluno(String [] texto) {
        this.uuid =  UUID.randomUUID();
        this.nome = texto[0];
        this.altura = new BigDecimal(texto[1]);
        this.peso = new BigDecimal(texto[2]);
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
}
