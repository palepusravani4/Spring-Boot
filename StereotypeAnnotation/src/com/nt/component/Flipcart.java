package com.nt.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flip")

public class Flipcart {
	@Autowired
	@Qualifier("java")
	private Courier courier;
    
	public void get(String msg) {
		courier.delivered("order is placed"+msg);
	}
}
