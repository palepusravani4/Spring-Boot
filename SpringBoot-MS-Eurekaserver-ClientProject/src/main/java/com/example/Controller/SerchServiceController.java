package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SerchServiceController {
	
	@GetMapping("display")
	public String displayMessage() {
		return "Welcome to Hyderabad";
	}
	

}
