package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.Appconfig1;
import com.nit.sbeans.Vehicle;

public class Enginemainclass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig1.class);
		Vehicle v=ctx.getBean("vehicle",Vehicle.class);
      v.journey("hyd","ong");
	}

}
