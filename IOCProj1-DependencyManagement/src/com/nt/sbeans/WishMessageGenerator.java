package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
     
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time=time;
	}
	public String showWishMessage(String name) {
		System.out.println("WishMessageGenerator.showWishMessage()");
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
