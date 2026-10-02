package com.example.Rest02;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {
	@GetMapping("/report")
	public ResponseEntity<String> showCustomerReport(){
		return new ResponseEntity<String>("from GET-showing method",HttpStatus.OK);
		}
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(){
		return new ResponseEntity<String>("from Post-showing method",HttpStatus.OK);
		}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updatrCustomer(){
		return new ResponseEntity<String>("from Put-showing method",HttpStatus.OK);
		}
	@PatchMapping("/pmodify")
	public ResponseEntity<String> updatrCustomerByNo(){
		return new ResponseEntity<String>("from Put-Update Customer BYNO method",HttpStatus.OK);
		}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(){
		return new ResponseEntity<String>("from delete-showing method",HttpStatus.OK);
		}

}
