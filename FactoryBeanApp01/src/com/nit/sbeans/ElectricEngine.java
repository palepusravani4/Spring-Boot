package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IEngine{
	
	

	public ElectricEngine() {
	System.out.println("ElectricEngine.ElectricEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine.startEngine()");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine.stopEngine()");
		
	}

}
