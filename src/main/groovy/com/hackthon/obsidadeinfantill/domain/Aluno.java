package com.hackthon.obsidadeinfantill.domain;

import java.math.BigDecimal;
import java.util.UUID;

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
}
