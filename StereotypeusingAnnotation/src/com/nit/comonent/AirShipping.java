package com.nit.comonent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("air")
public class AirShipping implements ShippingStrategy{
	
	@Value("${shipping.air.base}")
	private int base;
	@Value("${shipping.air.perKg}")
	private int perkg;

	@Override
	public double calculateCost(double weight) {
		
		double cost=base+perkg*weight;
		return cost;
	}

}
