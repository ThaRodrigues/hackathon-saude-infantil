package com.hackthon.obsidadeinfantill.enux;

import com.hackthon.obsidadeinfantill.domain.Aluno;
import com.hackthon.obsidadeinfantill.domain.BotSession;
import com.hackthon.obsidadeinfantill.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.EnumSet;

public enum Mensagem {

    SUCESSO("Alteração salva com sucesso \n"){
            @Override
            public BotSession validarMensagem(BotSession botSession, String mensagem){

                return botSession;
            }
    },
    MENU("Olá, informe 1 para realizar o cadastro de um novo aluno e 2 para atualizar um ja existente "){
        @Override
        public BotSession validarMensagem(BotSession botSession, String mensagem){
            mensagem.replace(" ", "");

            if(mensagem.equals("1")){

                botSession.setAcao(MenuAcao.CADASTRAR_ALUNO);
                botSession.setUltimaMensagem(Mensagem.NOME_ALUNO);
                botSession.setMensagemAtual(Mensagem.NOME_ALUNO.getMensagem());
            }else if(mensagem.equals("2")){

                botSession.setAcao(MenuAcao.ATUALIZAR_ALUNO);
                botSession.setUltimaMensagem(Mensagem.IDENTIFICAR_ALUNO);
                botSession.setMensagemAtual(Mensagem.IDENTIFICAR_ALUNO.getMensagem());
            }else{
                botSession.setMensagemAtual(Mensagem.MENSAGEM_INVALIDA.getMensagem());
            }

            return botSession;
        }
    },
    MENSAGEM_INVALIDA("Ops, não entendi, poderia informar novamente"){
        @Override
        public BotSession validarMensagem(BotSession botSession, String mensagem){

            return botSession;

        }
    },
    NOME_ALUNO("Informe o nome do aluno"){
        @Override
        public BotSession validarMensagem(BotSession botSession, String mensagem){

            return botSession;
        }
    },
    IDENTIFICAR_ALUNO("Informe o identificador do aluno", MenuAcao.ATUALIZAR_ALUNO, 1){
        @Override
        public BotSession validarMensagem(BotSession botSession, String mensagem){

            Aluno aluno = alunoService.buscarAluno(mensagem.replace(" ",""));

            if(aluno != null){
                botSession.setUltimaMensagem(Mensagem.ALTURA_ALUNO);
                botSession.setMensagemAtual(Mensagem.ALTURA_ALUNO.getMensagem());
                botSession.setAtualizacaoAluno(aluno);

            }else{
                botSession.setMensagemAtual(Mensagem.MENSAGEM_INVALIDA.getMensagem());
            }
            
            return botSession;
        }
    },
    ALTURA_ALUNO("Informe a altura do aluno " , MenuAcao.ATUALIZAR_ALUNO, 2){
        @Override
        public BotSession validarMensagem(BotSession botSession, String mensagem){

            try{
                BigDecimal altura =  new BigDecimal(mensagem.replace(" ", "").replace(",", "."));
                botSession.getAtualizacaoAluno().setAltura(altura);
                botSession.setUltimaMensagem(Mensagem.PESO_ALUNO);
                botSession.setMensagemAtual(Mensagem.PESO_ALUNO.getMensagem());

            }catch (Exception e){
                botSession.setMensagemAtual(Mensagem.MENSAGEM_INVALIDA.getMensagem());
            }

            return botSession;

        }
    },
    PESO_ALUNO("Informe o peso do aluno ", MenuAcao.ATUALIZAR_ALUNO, 3){
        @Override
        public BotSession validarMensagem(BotSession botSession, String mensagem){

            try{


                BigDecimal peso =  new BigDecimal(mensagem.replace(" ", "").replace(",", "."));
                botSession.getAtualizacaoAluno().setPeso(peso);
                botSession.setUltimaMensagem(Mensagem.MENU);
                botSession.setMensagemAtual(Mensagem.SUCESSO.getMensagem().concat(Mensagem.MENU.getMensagem()));
                alunoService.salvar(botSession.getAtualizacaoAluno());

            }catch (Exception e){
                botSession.setMensagemAtual(Mensagem.MENSAGEM_INVALIDA.getMensagem());
            }

            return botSession;
        }
    };


    private String mensagem;
    private MenuAcao acao;
    private int paso;
    private static AlunoService  alunoService;

    Mensagem(String mensagem, MenuAcao menuAcao, int paso){
        this.mensagem = mensagem;
        this.acao = menuAcao;
        this.paso = paso;
    }

    Mensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
         return mensagem;
    }

    public MenuAcao getAcao() {
        return acao;
    }

    public int getPaso() {
        return paso;
    }

    public void setAlunoService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public abstract BotSession validarMensagem(BotSession botSession, String mensagem);

    @Component
    public static class ServiceInjector {

        @Autowired
        public AlunoService alunoService;


        @PostConstruct
        public void postConstruct() {
            for (Mensagem rt : EnumSet.allOf(Mensagem.class))
                rt.setAlunoService(alunoService);
        }
    }
}