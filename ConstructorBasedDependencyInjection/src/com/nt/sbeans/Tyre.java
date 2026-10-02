package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
String brand;
int size;
public void setBrand(String brand) {
	this.brand = brand;
}
public void setSize(int size) {
	this.size = size;
}
public void showTyreDetails() {
	System.out.println("Tyre Details:"+" Brand = "+brand+", Size = "+size);
		
}
	
}
