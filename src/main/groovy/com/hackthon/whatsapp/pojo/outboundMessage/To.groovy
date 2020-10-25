package com.hackthon.whatsapp.pojo.outboundMessage

class To {
    private String phoneNumber

    To(String phoneNumber) {
        this.phoneNumber = phoneNumber
    }

    String getPhoneNumber() {
        return phoneNumber
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber
    }
}
