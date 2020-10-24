package com.hackthon.whatsapp.pojo.request
import com.fasterxml.jackson.*
import com.fasterxml.jackson.databind.ObjectMapper

class RequestBody {

    private static final String scenarioKey = "89BDF2C9B144F8BC45600C15B5B63D18"
    private List<Destination> destinations
    private WhatsApp whatsApp

    RequestBody(List<Destination> destinations, WhatsApp whatsApp) {
        this.destinations = destinations
        this.whatsApp = whatsApp
    }

    String getScenarioKey() {
        return scenarioKey
    }

    List<Destination> getDestinations() {
        return destinations
    }

    void setDestinations(List<Destination> destinations) {
        this.destinations = destinations
    }

    WhatsApp getWhatsApp() {
        return whatsApp
    }

    void setWhatsApp(WhatsApp whatsApp) {
        this.whatsApp = whatsApp
    }


    @Override
    String toString() {
        ObjectMapper mapper = new ObjectMapper()
        String jsonString = mapper.writeValueAsString(this)
        return jsonString
    }
}
