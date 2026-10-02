package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig3;
import com.nt.day1.sbeans.Bank;

public class DependencyInjectionTest7 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig3.class);
	   Bank b=act.getBean("b",Bank.class);
		b.showbrances();
	}

}
