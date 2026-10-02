package com.nt.day2.FactoryPattern;

import org.springframework.stereotype.Component;

@Component("rr")
public class ResidentialBilling implements BillingStrstegy{

	@Override
	public double calculateBill(double units) {
		
		return units*5;
	}

}
