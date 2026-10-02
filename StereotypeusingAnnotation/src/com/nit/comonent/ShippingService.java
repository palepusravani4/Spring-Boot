package com.nit.comonent;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ShippingService {
	
	Map<String, ShippingStrategy> map;

	public ShippingService(Map<String, ShippingStrategy> map) {
		super();
		this.map = map;
	}
	public double getShippingCost(String type, double weight) {
		ShippingStrategy s=map.get(type);
		if(s==null) {
			throw new IllegalArgumentException();
		}
	    return s.calculateCost(weight);
		
	}
}
