package com.nt.day1.sbeans;

public class SMSService implements MessageService{

	@Override
	public void send(String message) {
		System.out.println("SMS send :"+message);
		
	}

}
