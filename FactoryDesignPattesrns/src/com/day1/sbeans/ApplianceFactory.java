package com.day1.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ApplianceFactory {
	@Autowired
	Map<String,Appliance> app;
	public Appliance getAppliance(String type) {
		return app.get(type);
	}


}
