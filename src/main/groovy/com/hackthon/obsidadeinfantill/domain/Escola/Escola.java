package com.hackthon.obsidadeinfantill.domain.Escola;

import javax.persistence.*;

@Entity
@Table(name = "escola")
public class Escola {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TELEFONE")
    private String telefone;

    // TODO - alterar esse objeto
    @Transient
    private Endereco endereco;

    @Column(name = "ID_REITOR")
    private Long idReitor;


    public Escola() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getIdReitor() {
        return idReitor;
    }

    public void setIdReitor(Long idReitor) {
        this.idReitor = idReitor;
    }
}
