package com.nit.comonent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("road")
public class RoadShipping implements ShippingStrategy{

	@Value("${shipping.road.base}")
	private int base;
	@Value("${shipping.road.perKg}")
	private int perkg;

	@Override
	public double calculateCost(double weight) {
		
		double cost=base+perkg*weight;
		return cost;
	}

}
