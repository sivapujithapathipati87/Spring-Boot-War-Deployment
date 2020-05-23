package com.star.sud.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.star.sud.rest.bean.HelloBean;

@RestController
public class RestControler {

	@GetMapping("/hello")
	public String getHomePage() {
		return "Welcome to Spring Boot War Deployment";
	}

	@GetMapping("/hello/{message}")
	public HelloBean getWelcome(@PathVariable String message) {
		return new HelloBean(String.format("Welcome to %s", message));
	}

}
