package com.example.ExceptonHandling;

public class TouristNotFoundException extends Exception {
	
    public TouristNotFoundException() {
    	
    }
	public TouristNotFoundException(String msg) {
		super(msg);
	}

}
