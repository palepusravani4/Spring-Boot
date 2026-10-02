package com.nt.day1.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationService {
   
@Autowired
@Qualifier("ww")
MessageService messageService;
public void notifyUser(String msg) {
	messageService.send(msg);
}

}
