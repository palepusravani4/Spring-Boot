package com.nt.day2.FactoryPattern;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CustomerMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig2.class);
		
		ElectricityBillingSystem e=act.getBean(ElectricityBillingSystem.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer type (residential/commercial/industrial):");
		String obj=sc.next();
		BillingStrstegy d=(BillingStrstegy)act.getBean(obj);
		e.showBill(1000);

	}

}
