package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine{

	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine()");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine.stopEngine()");
		
	}

}
