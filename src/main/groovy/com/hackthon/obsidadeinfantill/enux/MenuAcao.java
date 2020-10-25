package com.hackthon.obsidadeinfantill.enux;

public enum MenuAcao {

    CADASTRAR_ALUNO(1),
    ATUALIZAR_ALUNO(2);


    private int numero;

    MenuAcao(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public static MenuAcao buscarPorNumero(int numero){
        for(MenuAcao acao : values()){
            if(acao.getNumero() == numero){
                return acao;
            }
        }
        return null;
    }
}