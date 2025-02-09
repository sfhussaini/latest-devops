package com.example.training.gettingstarted;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping(path="/greet", method = RequestMethod.GET)
	public String greet() {
		return "Greetings! Welcome to Spring Boot Microservice";
	}
	
	@PostMapping(path="/employees", produces=MediaType.TEXT_PLAIN_VALUE)
	public String create(String str) {
		return "created";
	}
}
