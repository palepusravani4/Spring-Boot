package com.nt.sbeans;

import java.time.LocalDate;


public class WishMessageGeneratorSeason {
	private LocalDate month;
	public WishMessageGeneratorSeason() {
		System.out.println("WishMessageGeneratorSeason.WishMessageGeneratorSeason()");
	}
	public void setMonth(LocalDate month) {
		this.month=month;
	}
	public String showWishMessage(String name) {
		int mon=month.getMonthValue();
		if(mon<4) {
			return "wintor season"+name;
		}
		else if(mon<8) {
			return "summer season"+name;
		}
		else {
			return "rainy season"+name;
		}
	}

}
