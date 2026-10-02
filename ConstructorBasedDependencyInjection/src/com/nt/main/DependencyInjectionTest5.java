package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig1;
import com.nt.day1.sbeans.Employee;

public class DependencyInjectionTest5 {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig1.class);
	
	Employee e=act.getBean(Employee.class);
	e.showempdetails();

	}

}
