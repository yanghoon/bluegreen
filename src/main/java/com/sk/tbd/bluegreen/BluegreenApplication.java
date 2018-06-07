package com.sk.tbd.bluegreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BluegreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluegreenApplication.class, args);
	}
	
	@GetMapping("/home") 
	public String home() {
		return "{\"app\":\"Bluegreen\",\"data\":\"green\"}";
	}
}
