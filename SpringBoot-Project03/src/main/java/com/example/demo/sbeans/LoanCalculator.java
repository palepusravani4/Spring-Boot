package com.example.demo.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LoanCalculator {
	@Autowired
	private InterestService service;
	
	public double calculateMonthlyInterest(double principal, double rate) {
		return (principal * rate) / 12 / 100;

	}
	public double calculateEMI(double principal, int months, String type) {
	 double prin=service.getRate(type);
	 double mon=calculateMonthlyInterest(principal, prin);
	 return (principal/months)+mon;
	
	}	
	public double getProcessingFee(String type) {
	
		
		if(type.equalsIgnoreCase("Home")) {
			return 2000;
		}
		else {
			return 1000;
		}
	}
public double generateFinalAmount(double emi, double fee) {
	return emi+fee;
}


}
