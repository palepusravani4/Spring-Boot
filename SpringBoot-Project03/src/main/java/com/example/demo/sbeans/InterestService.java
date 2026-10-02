package com.example.demo.sbeans;

import org.springframework.stereotype.Component;

@Component
public class InterestService {
	
	public double getRate(String loanType) {
		switch(loanType) {
		case "Home": return 7;
		case "Personal":return 11;
		case "Vehicle":return 9;
		default:throw new IllegalArgumentException("Invalid type :"+loanType);
 
		}
	}


}
