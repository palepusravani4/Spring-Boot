package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("vehicle")
public class Vehicle {
     @Qualifier("efactory")
	@Autowired
	private IEngine engine;
	
	public void journey(String startPlace,String desPlace) {
		System.out.println("journey start from :: "+startPlace);
		engine.startEngine();
		System.out.println("----journey is going on from "+startPlace+"to "+desPlace);
		System.out.println("journey stoped at ::"+desPlace);
		engine.stopEngine();
	}
	
}
