/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lrz.spotifyap.controllers;

import com.lrz.spotifyap.clients.AlbumSpotifyClient;
import com.lrz.spotifyap.clients.AuthSpotifyClient;
import com.lrz.spotifyap.clients.LoginRequest;
import com.lrz.spotifyap.clients.Album;
import java.util.List;
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
    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }
    
    
    @GetMapping("/albums")
    public ResponseEntity<List<Album>> listReleases(){
        
          var request = new LoginRequest("client_credentials", "client_id", 
                "client_secret");
          
          var token = authSpotifyClient.login(request).getAcessToken();
          
          var response = albumSpotifyClient.getReleases("Bearer " + token);
          
        return ResponseEntity.ok(response.getAlbums().getItems());
    }
            
}
