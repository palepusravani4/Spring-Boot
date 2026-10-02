package com.day1.sbeans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("notifier")
public class NotificationFactory {
	@Autowired
	@Qualifier("msg")
	private Notifier not;
	
	public Notifier getNotifier(String type) {
		return not;
		
	}

}
