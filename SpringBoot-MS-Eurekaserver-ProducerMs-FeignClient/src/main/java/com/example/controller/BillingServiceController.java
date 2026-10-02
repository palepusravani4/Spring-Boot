package com.example.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill-api")
public class BillingServiceController {
	@Value("${server.port}")
	private int port;
	@Value("${eureka.instance.instance-id}")
	private String instanceid;
	@GetMapping("/info")
	public ResponseEntity<String> getBillingInfo() {
		double bamt=new Random().nextDouble(40000);
		return new ResponseEntity<String>("Final Bill amount="+bamt+":: using instance ::->"+instanceid+" @port ::"+port,HttpStatus.OK);
	}
	@GetMapping("/wish")
	public ResponseEntity<String> showMessage(){
		return new ResponseEntity<String>("Good Night",HttpStatus.OK);
	}

}
