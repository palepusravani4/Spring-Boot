package com.nt.day1.sbeans;

public class WhatsAppService implements MessageService {

	@Override
	public void send(String message) {
		System.out.println("whatsaap meg send :"+message);
		
	}

}
