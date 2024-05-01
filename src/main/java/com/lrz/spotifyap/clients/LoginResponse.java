/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lrz.spotifyap.clients;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author lara
 */
public class LoginResponse {
    
    @JsonProperty("access_token")
    private String acessToken;

    public LoginResponse(String acessToken) {
        this.acessToken = acessToken;
    }

    public LoginResponse() {
    }

    public String getAcessToken() {
        return acessToken;
    }

    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }
    
}
