package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMessage {
	@GetMapping
	public String display() {
		return "Welcome to NareshIt";
	}

}
