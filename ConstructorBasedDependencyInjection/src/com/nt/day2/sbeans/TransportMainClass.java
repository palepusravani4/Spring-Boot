package com.nt.day2.sbeans;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.Appconfig;

public class TransportMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(Appconfig.class);
		TravelBooking  t=(TravelBooking) act.getBean(TravelBooking.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("== Travel Booking System ===");
       System.out.println("Book by Bus / Book by Train / Book by Flight / Exit");
       String name=sc.next();
       t.executeBooking(name, 0);
       t.setTransportation(null);
          
     
      
 
	}

}
