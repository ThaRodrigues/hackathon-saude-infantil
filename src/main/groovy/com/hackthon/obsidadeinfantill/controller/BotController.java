package com.hackthon.obsidadeinfantill.controller;

import com.hackthon.obsidadeinfantill.domain.BotSession;
import com.hackthon.obsidadeinfantill.domain.MensegemInfobitApi;
import com.hackthon.obsidadeinfantill.service.BotSessionService;
import com.hackthon.whatsapp.controller.Request;
import com.hackthon.whatsapp.pojo.inboundMessage.IncomingWhatsAppMessage;
import com.hackthon.whatsapp.pojo.inboundMessage.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/bot")
public class BotController {

    private HashMap<String, BotSession> secoes;

    private BotSessionService botSessionService;

    public BotController(HashMap<String, BotSession> secoes, BotSessionService botSessionService) {
        this.secoes = secoes;
        this.botSessionService = botSessionService;
    }

    @PostMapping
    public void botCore(@RequestBody IncomingWhatsAppMessage incomingWhatsAppMessage){

        Logger logger = LoggerFactory.getLogger(BotController.class);

        for(Result mensagem : incomingWhatsAppMessage.getResults() ){

            MensegemInfobitApi mensegemInfobitApi = new MensegemInfobitApi(mensagem);

            BotSession botSession;

            if(secoes.containsKey(mensegemInfobitApi.getNumeroCelular())){
                botSession = secoes.get(mensegemInfobitApi.getNumeroCelular());
            }else{
                botSession = new BotSession(mensegemInfobitApi.getNumeroCelular());
                secoes.put(mensegemInfobitApi.getNumeroCelular(), botSession);
            }

            botSession =  botSessionService.logica(botSession, mensegemInfobitApi.getMensagem());

            secoes.put(mensegemInfobitApi.getNumeroCelular(), botSession);

            Request request = new Request();
            String Response = request.sendRequest(botSession.getNumeroCelularSessao(), botSession.getMensagemAtual());

            logger.info(botSession.toString());
            logger.info(Response);
        }
    }
}