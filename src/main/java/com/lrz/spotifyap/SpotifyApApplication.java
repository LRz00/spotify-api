package com.lrz.spotifyap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpotifyApApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyApApplication.class, args);
	}

}
