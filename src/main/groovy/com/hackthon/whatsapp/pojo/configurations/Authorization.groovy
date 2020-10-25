package com.hackthon.whatsapp.pojo.configurations

import javax.xml.bind.DatatypeConverter

class Authorization {

    private static final String userName = "xxxx"
    private static final String password = "xxxx"


    String getAuthorizationBase64(){
        return "Basic " + encodeToBase64()
    }

    String getUserName() {
        return this.userName
    }

    String getPassword() {
        return this.password
    }

    @Override
    String toString(){
        return "This is the authorization config for user: " + this.userName
    }

    private String encodeToBase64() {
        String userPass = this.userName + ":" + this.password;
        return DatatypeConverter.printBase64Binary(userPass.getBytes());
    }

}
