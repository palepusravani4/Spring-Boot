package com.example.demo.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FeeCalculator {
	@Autowired
	private MembershipService service;
	public double calculateTotal(String type, boolean trainer) {
		double base=service.getBaseFee(type);
		double tri=service.getTrainerFee(trainer);
		return base+tri;
	}
	public double applyOffer(String type,double total) {
		if(type.equalsIgnoreCase("PREMIUM")) {
		
			return total*0.85;
		}
		else {
			return total;
		}
	}
	public double generateBill(String type, boolean trainer) {
		double tot=calculateTotal(type, trainer);
		return applyOffer(type, tot);
	}


}
