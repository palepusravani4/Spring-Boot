package com.day1.sbeans1;

import org.springframework.stereotype.Component;

@Component("pp")
public class PushNotifier implements Notifier {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending Push Notification: "+message);
		
	}

}
