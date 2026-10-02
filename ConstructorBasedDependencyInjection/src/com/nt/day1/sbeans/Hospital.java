package com.nt.day1.sbeans;

public class Hospital {
	String hname;
	Doctor d;
	Equipment e;
	public Hospital(String hname, Doctor d, Equipment e) {
		super();
		this.hname = hname;
		this.d = d;
		this.e = e;
	}
	public void showdetails() {
		System.out.println("Hospital: "+hname);
		d.showdetails();
		e.showequipment();
	}

}
