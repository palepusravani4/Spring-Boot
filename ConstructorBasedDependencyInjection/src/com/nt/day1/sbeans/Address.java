package com.nt.day1.sbeans;

public class Address {
    String city;
    String country;
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
    public void showaddress() {
    	System.out.println("Address: "+city+", "+country);
    }
}
