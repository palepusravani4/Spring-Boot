package com.nt.day1.sbeans;

public class Doctor {
	String name;
	String spe;
	public Doctor(String name, String spe) {
		super();
		this.name = name;
		this.spe = spe;
	}
	public void showdetails() {
		System.out.println("Doctor: "+name+" ("+spe+")");

}}
