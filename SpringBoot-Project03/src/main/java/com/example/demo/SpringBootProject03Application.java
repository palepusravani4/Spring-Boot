package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.sbeans.LoanCalculator;

@SpringBootApplication
public class SpringBootProject03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProject03Application.class, args);
	     LoanCalculator bean = ctx.getBean(LoanCalculator.class);
	   Scanner sc=new Scanner(System.in);
	   double pri=sc.nextDouble();
	   int mon=sc.nextInt();
	   String type=sc.next();
	   double emi=bean.calculateEMI(pri, mon, type);
	   double fee=bean.getProcessingFee(type);
	   double finalbill=bean.generateFinalAmount(emi, fee);
	   System.out.println("finalbill:"+finalbill);
	     
	     
	}

}
