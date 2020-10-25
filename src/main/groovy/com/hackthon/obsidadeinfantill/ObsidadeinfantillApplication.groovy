package com.hackthon.obsidadeinfantill

import com.hackthon.whatsapp.controller.Request
import com.hackthon.whatsapp.pojo.inboundMessage.IncomingWhatsAppMessage
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ObsidadeinfantillApplication {

	static void main(String[] args) {
		SpringApplication.run(ObsidadeinfantillApplication, args)

		//how to send a WA message
		Request request = new Request()
		String Response = request.sendRequest("5511952327997","Oi teste do codigo2")

		//Incoming message model
		IncomingWhatsAppMessage userMessage = new IncomingWhatsAppMessage()

	}

}
