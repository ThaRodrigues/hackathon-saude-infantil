package com.hackthon.obsidadeinfantill.domain.Escola;


import javax.persistence.*;

@Entity
@Table(name = "reitor")
public class Reitor {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TELEFONE")
    private String telefone;

    public Reitor() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
