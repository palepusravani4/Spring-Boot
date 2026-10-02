package com.nt.component;

import org.springframework.stereotype.Component;

@Component("new2")
public class DTDC implements Courier{

	@Override
	public void delivered(String name) {
	System.out.println("DTDC is delivered........."+name);
		
	}

}
