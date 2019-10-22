package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodestatebkendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodestatebkendApplication.class, args);
	}

	@GetMapping("/")
	public static String hello() {
		return "hello";
	}

	@GetMapping("/readDataForCode")
	public static String requestCodeData() {
		String s = "{\"AL\": \"Alabama\",\"AK\": \"Alaska\"}";
		return s;
	}

	@GetMapping("/readDataForState")
	public static String requestStateData() {
		String s = "[{\"name\": \"Alabama\",\"abbreviation\": \"AL\"},{\"name\": \"Alaska\",\"abbreviation\": \"AK\"}]";
		return s;
	}
}
