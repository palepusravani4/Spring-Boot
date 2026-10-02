package com.nt.day1.sbeans;

import java.util.Map;

public class Bank {
	String bankname;
	Map<String,String>branches;
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public void setBranches(Map<String, String> branches) {
		this.branches = branches;
	}
	public void showbrances() {
		System.out.println("Bank Name :"+bankname);
		System.out.println("Bank details");
		//branches.forEach((x,y)->System.out.println("code :"+x+" -> "+y));
		
		//2nd way
		for(Map.Entry<String,String> e:branches.entrySet()) {
			System.out.println("Code :"+e.getKey()+" -> "+e.getValue());
			
		}
	}

}
