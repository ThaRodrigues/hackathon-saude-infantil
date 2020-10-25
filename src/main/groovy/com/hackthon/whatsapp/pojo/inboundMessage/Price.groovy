package com.hackthon.whatsapp.pojo.inboundMessage

class Price {

    private int pricePerMessage
    private String currency

    int getPricePerMessage() {
        return pricePerMessage
    }

    void setPricePerMessage(int pricePerMessage) {
        this.pricePerMessage = pricePerMessage
    }

    String getCurrency() {
        return currency
    }

    void setCurrency(String currency) {
        this.currency = currency
    }
}
