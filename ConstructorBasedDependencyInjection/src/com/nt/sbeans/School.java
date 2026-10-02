package com.nt.sbeans;

public class School {
 String schoolName;
 Principal principal;
 Address address;
 public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
 }
 public void setPrincipal(Principal principal) {
	this.principal = principal;
 }
 public void setAddress(Address address) {
	this.address = address;
 }
 public void showdetails() {
	System.out.println("School: "+schoolName);
	principal.pricipal();
	address.displayinfo();
 }
}
