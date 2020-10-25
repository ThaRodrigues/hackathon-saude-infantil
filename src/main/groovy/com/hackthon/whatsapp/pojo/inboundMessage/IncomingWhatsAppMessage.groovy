package com.hackthon.whatsapp.pojo.inboundMessage

class IncomingWhatsAppMessage {

    private List<Result> results
    private int messageCount
    private int pendingMessageCount

    List<Result> getResults() {
        return results
    }

    void setResults(List<Result> results) {
        this.results = results
    }

    int getMessageCount() {
        return messageCount
    }

    void setMessageCount(int messageCount) {
        this.messageCount = messageCount
    }

    int getPendingMessageCount() {
        return pendingMessageCount
    }

    void setPendingMessageCount(int pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount
    }
}
