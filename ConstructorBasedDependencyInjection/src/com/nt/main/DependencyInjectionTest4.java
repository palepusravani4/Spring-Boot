package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.Appconfig;
import com.nt.sbeans.School;

public class DependencyInjectionTest4 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(Appconfig.class);
		School s=act.getBean(School.class);
		s.showdetails();
		act.close();

	}

}
