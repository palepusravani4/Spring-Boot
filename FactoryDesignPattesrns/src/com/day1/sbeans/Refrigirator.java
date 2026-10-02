package com.day1.sbeans;

import org.springframework.stereotype.Component;

@Component("rr")
public class Refrigirator implements Appliance{

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Refrigerator with inverter technology.");
		
	}

}
