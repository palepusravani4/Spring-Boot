package com.example.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;



@FeignClient("ProducerFeign")
public interface IBillingServiceOperation {
	@GetMapping("/bill-api/info")
	public ResponseEntity<String> getBillingInfo();
	@GetMapping("/bill-api/wish")
	public ResponseEntity<String> showMessage();

}
