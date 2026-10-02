package com.day1.sbeans;

import org.springframework.stereotype.Component;

@Component("WW")
public class WashingMechine implements Appliance {

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Washing Machine with smart sensors.");
		
	}

}
