package com.day1.sbeans1;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotifier implements Notifier{

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS Notification: "+message);
		
	}

}
