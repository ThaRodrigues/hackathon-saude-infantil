package com.hackthon.whatsapp.pojo.inboundMessage

class Message {

    private String type
    private String text

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

    String getText() {
        return text
    }

    void setText(String text) {
        this.text = text
    }
}
