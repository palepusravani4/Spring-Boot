package com.example.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season")
public class SeasonFinderApi {
	@Value("${spring.application.instance-id}")
	private String instance_d;
	@GetMapping("/finder")
	public ResponseEntity<String> findSeason(){
		LocalDateTime lt=LocalDateTime.now();
		
		int month=lt.getMonthValue();
		String name=null;
		if(month>=7&&month<=10) {
			name="Rainy";
		}
		else if(month>=3&&month<=6) {
			name="summer";
		}
		else {
			name="winter";
		}
		return new ResponseEntity<String>(name,HttpStatus.OK);
	}

}
