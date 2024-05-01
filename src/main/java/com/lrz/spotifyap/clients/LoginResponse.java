/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lrz.spotifyap.clients;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
/**
 *
 * @author lara
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    
    @JsonProperty("access_token")
    private String acessToken;

    
}
