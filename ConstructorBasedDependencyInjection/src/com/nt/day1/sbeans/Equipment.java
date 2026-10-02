package com.nt.day1.sbeans;

public class Equipment {
	String ename;
	double cost;
	public Equipment(String ename, double cost) {
		super();
		this.ename = ename;
		this.cost = cost;
	}
	public void showequipment() {
		System.out.println("Equipment: "+ename+" (Cost: ₹"+cost+")");
	}

}
