package com.nt.day2.FactoryPattern;

import org.springframework.stereotype.Component;

@Component("ii")
public class IndustrialBilling implements BillingStrstegy{

	@Override
	public double calculateBill(double units) {
		
		return units*10;
	}

}
