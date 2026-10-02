package com.example.ms;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.IBillingServiceOperation;

@RestController
@RequestMapping("/shop")
public class ShoppingServiceController {
	@Autowired
	private IBillingServiceOperation client;
	@GetMapping("/details")
	public ResponseEntity<String> showbillDetails(){
		String [] items=new String[] {"shirt","trouser"};
		ResponseEntity<String> billmsg=client.getBillingInfo();
		String fm="Items are added to cart are "+Arrays.toString(items)+"...."+billmsg.getBody()+"......"+client.showMessage().getBody();
		return new ResponseEntity<String>("shoppinf the items(shirt,trouser)........"+fm, HttpStatus.OK);
	}

}
