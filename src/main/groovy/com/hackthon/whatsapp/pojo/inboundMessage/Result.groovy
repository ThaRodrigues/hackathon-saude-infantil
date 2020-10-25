package com.hackthon.whatsapp.pojo.inboundMessage

class Result {

    private String from
    private String to
    private String integrationType
    private Date receivedAt
    private String messageId
    private Object pairedMessageId
    private Object callbackData
    private Message message
    private Price price

    String getFrom() {
        return from
    }

    void setFrom(String from) {
        this.from = from
    }

    String getTo() {
        return to
    }

    void setTo(String to) {
        this.to = to
    }

    String getIntegrationType() {
        return integrationType
    }

    void setIntegrationType(String integrationType) {
        this.integrationType = integrationType
    }

    Date getReceivedAt() {
        return receivedAt
    }

    void setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt
    }

    String getMessageId() {
        return messageId
    }

    void setMessageId(String messageId) {
        this.messageId = messageId
    }

    Object getPairedMessageId() {
        return pairedMessageId
    }

    void setPairedMessageId(Object pairedMessageId) {
        this.pairedMessageId = pairedMessageId
    }

    Object getCallbackData() {
        return callbackData
    }

    void setCallbackData(Object callbackData) {
        this.callbackData = callbackData
    }

    Message getMessage() {
        return message
    }

    void setMessage(Message message) {
        this.message = message
    }

    Price getPrice() {
        return price
    }

    void setPrice(Price price) {
        this.price = price
    }
}
