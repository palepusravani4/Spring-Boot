package com.nt.day2.sbeans;

public class TravelBooking {

	Transportation transportation;

	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}
	public void executeBooking(String destination, double price) {
		
		transportation.bookTrip(destination, price);
	}
}
