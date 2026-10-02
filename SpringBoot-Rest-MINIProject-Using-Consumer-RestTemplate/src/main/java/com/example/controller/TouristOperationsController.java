package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Service.ITouristMgmtService;
import com.example.entity.Tourist;
@RestController
@RequestMapping("/tourist")
public class TouristOperationsController {
	@Autowired
	ITouristMgmtService service;
	/*@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tt){
		try {
			String msg=service.registerTourist(tt);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
			}
		catch(Exception e) {
			return new ResponseEntity<String>("problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/findall")
	public ResponseEntity<?> displayTourists(){
		try {
			List<Tourist> list= service.fetchAllTourists();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<String>("proble is fetching tourists",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/find/{c1}/{c2}/{c3}")
	public ResponseEntity<?> fetchTouristsByCities(@PathVariable(required=false) String c1,
			@PathVariable(required=false) String c2,
			@PathVariable(required=false) String c3){
	try {
		List<Tourist> list=service.showAllTourist(c1, c2, c3);
		list.forEach(System.out::println);
		return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
	}
	catch(Exception e) {
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id){
		try {
			Tourist tt= service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tt, HttpStatus.OK);
		} catch (TouristNotFoundException e) {
		
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/modify")
	public ResponseEntity<?> modifyTourist(@RequestBody Tourist tt){
	   	String msg;
		try {
			msg = service.updateTouristDetails(tt);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (TouristNotFoundException e) {
			e.printStackTrace();
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/findname/{name}")
	public ResponseEntity<?> findTouristsByName(@PathVariable("name") String name){
		try {
		List<Tourist> list = service.findAllTouristByName(name);
	   return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	
	}}
	@PatchMapping("/pupdate/{id}/{per}")
	public ResponseEntity<?> modifyTouristBudgetDetailsById(@PathVariable("id") int id,@PathVariable("per") double per){
	
		try {
			String msg = service.updateTouristBudgetById(id, per);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (TouristNotFoundException e) {
			
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTouristById(@PathVariable("id") int id) {
		try {
			String remove = service.removeTouristById(id);
			return new ResponseEntity<String>(remove,HttpStatus.OK);
			
		} catch (TouristNotFoundException e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/delete/{start}/{end}")
	public ResponseEntity<?> deleteTouristByBudgetRange(@PathVariable("start") double start,@PathVariable("end") double end){
		try {
		String msg=service.removeTouristsByBudgetRang(start, end);
	   return new ResponseEntity<String>(msg,HttpStatus.OK);
	}catch (Exception e) {
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	}*/
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tt) throws Exception{
		
			String msg=service.registerTourist(tt);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
		
	}
	@GetMapping("/findall")
	public ResponseEntity<?> displayTourists() throws Exception{
		
			List<Tourist> list= service.fetchAllTourists();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		
	}
	@GetMapping("/find/{c1}/{c2}/{c3}")
	public ResponseEntity<?> fetchTouristsByCities(@PathVariable(required=false) String c1,
			@PathVariable(required=false) String c2,
			@PathVariable(required=false) String c3) throws Exception{

		List<Tourist> list=service.showAllTourist(c1, c2, c3);
		list.forEach(System.out::println);
		return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
	
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id) throws Exception{
	
			Tourist tt= service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tt, HttpStatus.OK);
		
	}
	@PostMapping("/modify")
	public ResponseEntity<?> modifyTourist(@RequestBody Tourist tt) throws Exception{
	   
			String msg = service.updateTouristDetails(tt);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@GetMapping("/findname/{name}")
	public ResponseEntity<?> findTouristsByName(@PathVariable("name") String name) throws Exception{

		List<Tourist> list = service.findAllTouristByName(name);
	   return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
	
	
	}
	@PatchMapping("/pupdate/{id}/{per}")
	public ResponseEntity<?> modifyTouristBudgetDetailsById(@PathVariable("id") int id,@PathVariable("per") double per) throws Exception{
	
	
			String msg = service.updateTouristBudgetById(id, per);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTouristById(@PathVariable("id") int id) throws Exception {
	
			String remove = service.removeTouristById(id);
			return new ResponseEntity<String>(remove,HttpStatus.OK);
			
		
	}
	
	@DeleteMapping("/delete/{start}/{end}")
	public ResponseEntity<?> deleteTouristByBudgetRange(@PathVariable("start") double start,@PathVariable("end") double end) throws Exception{
	
		String msg=service.removeTouristsByBudgetRang(start, end);
	   return new ResponseEntity<String>(msg,HttpStatus.OK);
	
	
	}
	
	
	

}
