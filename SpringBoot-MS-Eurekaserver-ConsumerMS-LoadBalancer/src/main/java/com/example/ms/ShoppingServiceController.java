package com.example.ms;



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
		try {
			Thread.sleep(20000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return new ResponseEntity<String>("shoppinf the items(shirt,trouser)........"+billmsg, HttpStatus.OK);
	}

}
