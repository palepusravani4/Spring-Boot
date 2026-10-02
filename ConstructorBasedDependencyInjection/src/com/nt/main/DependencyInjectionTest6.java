package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig2;
import com.nt.day1.sbeans.Company;

public class DependencyInjectionTest6 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig2.class);
         Company c=act.getBean(Company.class);
         c.showdepartment();
	}

}
