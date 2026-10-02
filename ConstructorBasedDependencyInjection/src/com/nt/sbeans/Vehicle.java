package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
 
	String vehicleName;
	Engine engine;
	Tyre tyre;
	public Vehicle(Engine engine) {
		super();
		this.engine = engine;
	}
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public void displayVehicleInfo() {
		engine.showEngineDetails();
		tyre.showTyreDetails();
		System.out.println("Vehicle:"+vehicleName);
	}
}
