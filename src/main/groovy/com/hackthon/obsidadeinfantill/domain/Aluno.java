package com.hackthon.obsidadeinfantill.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE,
            generator = "aluno_id_seq")
    @SequenceGenerator(
            name = "aluno_id_seq",
            sequenceName = "aluno_id_sequence",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "IDADE")
    private int idade;

    @Column(name = "ALTURA")
    private BigDecimal altura;

    @Column(name = "PESO")
    private BigDecimal peso;

    @Column(name = "ID_ESCOLA")
    private Long idEscola;

    public Aluno(){
        this.uuid =  UUID.randomUUID();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Long idEscola) {
        this.idEscola = idEscola;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static Aluno criar(List<String> campos){

        Aluno aluno = new Aluno();
        aluno.setNome(campos.get(0));
        aluno.setPeso(campos.get(1).isEmpty() ? null : new BigDecimal(campos.get(1)));
        aluno.setAltura(campos.get(2).isEmpty() ? null : new BigDecimal(campos.get(2)));

        return aluno;
    }
}
