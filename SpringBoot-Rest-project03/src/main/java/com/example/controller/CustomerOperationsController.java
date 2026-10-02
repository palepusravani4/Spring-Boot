package com.example.controller;
import com.example.model.Customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationsController {
	
	/*@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer cust) {
     return cust.toString();}*/
	/*
	 * @GetMapping("/report") public Customer showData() { Customer cust=new
	 * Customer(1001,"raja","hyd",445566.77f); return cust; }
	 */
	
	/*
	 * @GetMapping("/report") public ResponseEntity<Customer> showData() { Customer
	 * cust=new Customer(1001,"raja","hyd",445566.77f); return new
	 * ResponseEntity<Customer>(cust,HttpStatus.OK); }
	 */
	/*
	 * @GetMapping("/new/no/name") public String
	 * reportData1(@PathVariable(required=false) Integer no,
	 * 
	 * @PathVariable(name="name" ,required=false) String cname) { return "report1";
	 * }
	 * 
	 * @GetMapping("/new/no/{name}") public String
	 * reportData2(@PathVariable(required=false) Integer no,
	 * 
	 * @PathVariable(name="name" ,required=false) String cname) { return "report2";
	 * }
	 * 
	 * @GetMapping("/new/{no}/{name}") public String
	 * reportData3(@PathVariable(required=false) Integer no,
	 * 
	 * @PathVariable(name="name" ,required=false) String cname) { return "report3";
	 * }
	 * 
	 * @GetMapping("/new/{no}/name") public String
	 * reportData4(@PathVariable(required=false) Integer no,
	 * 
	 * @PathVariable(name="name" ,required=false) String cname) { return "report4";
	 * }
	 */
	/*
	 * @GetMapping("/new/101/priya") public String reportData5() { return
	 * " new report 1"; }
	 * 
	 * @GetMapping("/new/{no}/name") public String
	 * reportData6(@PathVariable(required=false) Integer no,
	 * 
	 * @PathVariable(name="name" ,required=false) String cname) { return
	 * "new report 2"; }
	 */
	@GetMapping({"/new/{no}/{name}","/new/{no}","/new"})
	public String reportData4(@PathVariable(required=false) Integer no,
			@PathVariable(required=false) String name) {
		return no+" "+name;
	}
}
