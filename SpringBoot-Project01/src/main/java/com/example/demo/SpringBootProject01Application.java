package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.sbeans.BillCalculator;

@SpringBootApplication
public class SpringBootProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootProject01Application.class, args);
	     BillCalculator bean = ctx.getBean(BillCalculator.class);
	   System.out.println(bean.calculateDiscount(5000));
	    System.out.println(bean.calculateTotalBill(100));
	
	
	}

}
