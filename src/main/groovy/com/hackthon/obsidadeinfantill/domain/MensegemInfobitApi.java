package com.hackthon.obsidadeinfantill.domain;

import com.hackthon.whatsapp.pojo.inboundMessage.Result;

public class MensegemInfobitApi {

    private String numeroCelular;
    private String mensagem;


    public MensegemInfobitApi(Result result) {
        this.numeroCelular = result.getFrom();
        this.mensagem = result.getMessage().getText();
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}