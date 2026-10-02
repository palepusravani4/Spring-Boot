package com.nit.comonent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sea")
public class SeaShipping implements ShippingStrategy{

	@Value("${shipping.sea.base}")
	private int base;
	@Value("${shipping.sea.perKg}")
	private int perkg;

	@Override
	public double calculateCost(double weight) {
		
		double cost=base+perkg*weight;
		return cost;
	}

}
