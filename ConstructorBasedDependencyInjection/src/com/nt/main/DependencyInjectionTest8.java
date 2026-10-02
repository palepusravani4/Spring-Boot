package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig4;
import com.nt.day1.sbeans.Hospital;

public class DependencyInjectionTest8 {

	

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig4.class);
         Hospital h=act.getBean("hh",Hospital.class);
		h.showdetails();
	}

}
