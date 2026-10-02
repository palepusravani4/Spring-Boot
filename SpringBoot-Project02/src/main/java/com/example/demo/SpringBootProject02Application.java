package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.sbeans.FeeCalculator;

@SpringBootApplication
public class SpringBootProject02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootProject02Application.class, args);
	   FeeCalculator bean = ctx.getBean(FeeCalculator.class);
	   Scanner sc=new Scanner(System.in);
	   String name=sc.next();
	   boolean tri=sc.nextBoolean();
	   System.out.println(bean.generateBill(name, tri));
	}

}
