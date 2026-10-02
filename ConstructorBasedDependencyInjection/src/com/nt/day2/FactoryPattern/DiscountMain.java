package com.nt.day2.FactoryPattern;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiscountMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig1.class);
		BillService b=act.getBean(BillService.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("chooses customer type (Regular, Premium, Elite).");
		String name=sc.next();
		DiscountStrategy dis=(DiscountStrategy)act.getBean(name);
		//dis.calculateDiscount(500);
		b.generateBill(100);

	}

}
