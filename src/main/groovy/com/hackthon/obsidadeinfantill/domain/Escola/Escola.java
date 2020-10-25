package com.hackthon.obsidadeinfantill.domain.Escola;

public class Escola {

    private String nomeEscola;
    private String telefone;
    private Endereco endereco;
    private Reitor reitor;

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Reitor getReitor() {
        return reitor;
    }

    public void setReitor(Reitor reitor) {
        this.reitor = reitor;
    }
}
