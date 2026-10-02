package com.example.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.BillingServiceOperation;

@RestController
@RequestMapping("/shop")
public class ShoppingServiceController {
	@Autowired
	private BillingServiceOperation client;
	@GetMapping("/details")
	public ResponseEntity<String> showbillDetails(){
		String billmsg=client.getBillingInfo();
		String bill="Bill amount :: "+new Random().nextInt(1000);
		return new ResponseEntity<String>(bill+"........"+billmsg, HttpStatus.OK);
	}

}
