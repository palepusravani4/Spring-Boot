package com.nt.day2.FactoryPattern;

import org.springframework.stereotype.Component;

@Component("elite")
public class EliteCustomer implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		
		return amount*0.15;
	}

}
