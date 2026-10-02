package com.nt.day2.FactoryPattern;

import org.springframework.stereotype.Component;

@Component("cc")
public class CommercialBilling implements BillingStrstegy {

	@Override
	public double calculateBill(double units) {
		return units*8;
	}

}
