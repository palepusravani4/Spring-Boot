package com.nt.day2.FactoryPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class BillService {
	@Autowired
	@Qualifier("elite")
	
	DiscountStrategy dis;
	
	public void generateBill(double amount) {
		double discount = dis.calculateDiscount(amount);
		System.out.println("Original Amount:"+amount);
		System.out.println("Discount Applied:"+discount);
		System.out.println("Final Payable Amount:"+(amount-discount));
		System.out.println(dis.calculateDiscount(amount));
	}


}
