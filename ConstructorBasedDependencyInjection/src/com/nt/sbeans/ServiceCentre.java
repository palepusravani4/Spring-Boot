package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCentre {
	
	@Autowired
	Vehicle vehicle;
	String serviceType;
	
	public void performService() {
		System.out.println("=== Vehicle Manufacturing & Service System ===");
		vehicle.displayVehicleInfo();
		System.out.println("Service Type "+serviceType);
	}

}
