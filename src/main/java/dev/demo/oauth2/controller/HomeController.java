package dev.demo.oauth2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Hello, Home!";
	}

	@GetMapping("/secured")
	public String secured() {
		return "Hello, Secured!";
	}

}