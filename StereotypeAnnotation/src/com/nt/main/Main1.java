package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.Appconfig;
import com.nt.component.Flipcart;

public class Main1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		Flipcart f=ctx.getBean("flip",Flipcart.class);
		f.get("raja");
	}

}
