package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGeneratorUsingConstructorInjection {
	private LocalTime time;
	private LocalDate date;
	private String address;
	public WishMessageGeneratorUsingConstructorInjection(LocalTime time, LocalDate date, String address) {
		super();
		this.time = time;
		this.date = date;
		this.address = address;
		System.out.println(
				"WishMessageGeneratorUsingConstructorInjection.WishMessageGeneratorUsingConstructorInjection()::3 arg constructor");
	}
	public void setAddress(String address) {
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
