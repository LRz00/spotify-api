/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lrz.spotifyap.controllers;

import com.lrz.spotifyap.clients.AuthSpotifyClient;
import com.lrz.spotifyap.clients.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lara
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
    
    private final AuthSpotifyClient authSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }
    
    
    @GetMapping("/albums")
    public ResponseEntity<String> helloWorld(){
        
        var request = new LoginRequest("client_credentials", "client_id", 
                "client_secret");
        return ResponseEntity.ok(authSpotifyClient.login(request).getAcessToken());
    }
            
}
