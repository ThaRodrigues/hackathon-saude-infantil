package com.hackthon.obsidadeinfantill.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agente")
public class Agente {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE,
            generator = "agente_id_seq")
    @SequenceGenerator(
            name = "agente_id_seq",
            sequenceName = "agente_id_sequence",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SOBRENOME")
    private String sobrenome;

    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "ATIVO")
    private String ativo;

    @Column(name = "CELULAR")
    private String celular;

    public Agente() { }

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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}