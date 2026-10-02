package com.nt.day2.FactoryPattern;

import org.springframework.stereotype.Component;

@Component("premium")
public class PremiumCustomer implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		
		return amount*0.10;
	}

}
