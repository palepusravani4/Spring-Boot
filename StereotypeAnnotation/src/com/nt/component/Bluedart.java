package com.nt.component;

import org.springframework.stereotype.Component;

@Component("new1")
public class Bluedart implements Courier{

	@Override
	public void delivered(String name) {
		System.out.println("Bluedart is delivered....."+name);
		
	}

}
