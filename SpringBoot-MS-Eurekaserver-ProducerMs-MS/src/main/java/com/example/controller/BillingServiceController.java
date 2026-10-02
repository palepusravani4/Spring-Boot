package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill-api")
public class BillingServiceController {
	@GetMapping("/info")
	public String getBillingInfo() {
		return "we accept card payment,upi payment,netbanking,cod";
	}

}
