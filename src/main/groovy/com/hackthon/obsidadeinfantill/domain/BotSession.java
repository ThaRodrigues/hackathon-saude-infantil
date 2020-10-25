package com.hackthon.obsidadeinfantill.domain;

import com.hackthon.obsidadeinfantill.enux.Mensagem;
import com.hackthon.obsidadeinfantill.enux.MenuAcao;

public class BotSession {

    private String numeroCelularSessao;
    private MenuAcao acao;
    private Mensagem ultimaMensagem;
    private String mensagemAtual;
    private Aluno criacaoAluno;
    private Aluno atualizacaoAluno;


    public BotSession(String numeroCelularSessao) {
        this.numeroCelularSessao = numeroCelularSessao;
    }


    public String getNumeroCelularSessao() {
        return numeroCelularSessao;
    }

    public void setNumeroCelularSessao(String numeroCelularSessao) {
        this.numeroCelularSessao = numeroCelularSessao;
    }

    public MenuAcao getAcao() {
        return acao;
    }

    public void setAcao(MenuAcao acao) {
        this.acao = acao;
    }

    public String getMensagemAtual() {
        return mensagemAtual;
    }

    public void setMensagemAtual(String mensagemAtual) {
        this.mensagemAtual = mensagemAtual;
    }

    public Mensagem getultimaMensagem(){
        return ultimaMensagem;
    }


    public Mensagem getUltimaMensagem() {
        return ultimaMensagem;
    }

    public void setUltimaMensagem(Mensagem ultimaMensagem) {
        this.ultimaMensagem = ultimaMensagem;
    }

    public Aluno getCriacaoAluno() {
        return criacaoAluno;
    }

    public void setCriacaoAluno(Aluno criacaoAluno) {
        this.criacaoAluno = criacaoAluno;
    }

    public Aluno getAtualizacaoAluno() {
        return atualizacaoAluno;
    }

    public void setAtualizacaoAluno(Aluno atualizacaoAluno) {
        this.atualizacaoAluno = atualizacaoAluno;
    }

    @Override
    public String toString() {
        return "BotSession{" +
                "numeroCelularSessao='" + numeroCelularSessao + '\'' +
                ", acao=" + acao +
                ", ultimaMensagem=" + ultimaMensagem +
                ", mensagemAtual='" + mensagemAtual + '\'' +
                ", criacaoAluno=" + criacaoAluno +
                ", atualizacaoAluno=" + atualizacaoAluno +
                '}';
    }
}