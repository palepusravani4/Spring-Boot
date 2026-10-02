package com.nt.day2.FactoryPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ElectricityBillingSystem {

	@Autowired
	@Qualifier("ii")
	BillingStrstegy bs;
	public void showBill(double units) {
		double d=bs.calculateBill(units);
		System.out.println("consumed "+units);
		System.out.println("Total bill amount  "+d);
	}

}
