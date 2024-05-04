/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lrz.spotifyap.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 *
 * @author lara
 */

@FeignClient(name = "AlbumSpotifyClient", url = "https://api.spotify.com")
public interface AlbumSpotifyClient {
    
     @GetMapping(value="v1/browse/new-releases")
     AlbumResponse getReleases(@RequestHeader("Authorization") String authorization);
     
     
     /*Metodo de pegar albums de artista especifico não retorna o "albums:{}" no corpo do json
     modelo de url: v1/artists/{id}/albums"
     */   
     @GetMapping(value = "v1/artists/7n2Ycct7Beij7Dj7meI4X0/albums")
     AlbumWrapper getTwiceAlbums(@RequestHeader("Authorization") String authorization); 
}
