package com.nt.day1.sbeans;

public class EmailService implements MessageService{

	@Override
	public void send(String message) {
		System.out.println("Email send :"+message);
		
	}

}
