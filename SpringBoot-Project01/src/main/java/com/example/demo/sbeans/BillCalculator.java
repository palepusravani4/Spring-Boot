package com.example.demo.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillCalculator {
	@Autowired
	private PriceService service;
	
	public double calculateTotalBill(int units) {
		double tot=service.calculateUnitCost(units);
		double cha=service.calculateFixedCharge();
		return tot+cha;
	}
    public double calculateDiscount(double total) {
    	if(total>1000) {
    		return total*0.1;
    	}
    	return 0;
    }
   public double generateFinalBill(int units) {
	   double tot=service.calculateUnitCost(units);
	   double dis=calculateDiscount(tot);
	   return tot-dis;
   }


}
