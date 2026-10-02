package com.nt.day2.FactoryPattern;

import org.springframework.stereotype.Component;

@Component("regular")
public class RegularCustomer implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		double amt=amount*0.05;
		return amt;
	}

}
