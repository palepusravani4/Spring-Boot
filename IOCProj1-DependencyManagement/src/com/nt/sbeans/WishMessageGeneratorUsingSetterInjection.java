package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGeneratorUsingSetterInjection {
	
	private LocalTime time;
	private LocalDate date;
	private String address;
	public WishMessageGeneratorUsingSetterInjection() {
		System.out.println("WishMessageGeneratorUsingSetterInjection.WishMessageGeneratorUsingSetterInjection()");
	}
     
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time=time;
	}
	public void setDate(LocalDate date) {
		System.out.println("WishMessageGeneratorUsingSetterInjection.setDate()");
		this.date=date;
	}
	public void setAddress(String address) {
		System.out.println("WishMessageGeneratorUsingSetterInjection.setAddress()");
		this.address=address;
	}
	public String showWishMessage(String name) {
		System.out.println("WishMessageGenerator.showWishMessage()"+time+date+address);
		int hour=time.getHour();
		if(hour<12) {
			return "Good Morning"+name;
		}
		else if(hour<16) {
			return "Good AfterNoon"+name;
		}
		else if(hour<20) {
			return "Good Evening"+name;
		}
		else {
			return "Good Night"+name;
		}
	}
}



