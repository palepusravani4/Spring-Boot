package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.comonent.SpringDetails;
import com.nit.configuration.Appconfig1;

public class SpringClassMain {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig1.class);
		SpringDetails sp=ctx.getBean(SpringDetails.class);
		System.out.println(sp);

	}

}
