package com.hackthon.obsidadeinfantill.service;

import com.hackthon.obsidadeinfantill.domain.BotSession;
import com.hackthon.obsidadeinfantill.enux.Mensagem;
import org.springframework.stereotype.Service;


@Service
public class BotSessionService {

    public BotSession logica(BotSession botSession, String mensagem){

        if(botSession.getultimaMensagem() == null){
            botSession.setUltimaMensagem(Mensagem.MENU);
            botSession.setMensagemAtual(Mensagem.MENU.getMensagem());
            return botSession;
        }

        botSession = botSession.getultimaMensagem().validarMensagem(botSession, mensagem);

        return botSession;
    }
}