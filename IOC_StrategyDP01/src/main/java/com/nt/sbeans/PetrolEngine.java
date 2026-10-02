package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pen")
public class PetrolEngine implements IEngine{

	@Override
	public void startEngine() {
		
		System.out.println("PetrolEngine.startEngine()");
	}

	@Override
	public void stopEngin() {
		System.out.println("PetrolEngine.stopEngin()");		
	}

}
