package com.nt.IOC_StrategyDP01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;

public class StategyDIMain1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle v=act.getBean("",Vehicle.class);
		
	}

}
