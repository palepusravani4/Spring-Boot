package com.nt.sbeans;

public class Address {
  String city;
  String state;
  public void setCity(String city) {
	this.city = city;
  }
  public void setState(String state) {
	this.state = state;
  }
  public void displayinfo() {
	  System.out.println("Location: "+city+", "+city);
  }
}
