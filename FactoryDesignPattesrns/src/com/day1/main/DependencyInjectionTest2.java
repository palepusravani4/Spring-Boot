package com.day1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.day1.Configuaration.AppConfig2;
import com.day1.sbeans1.NotificationFactory;

public class DependencyInjectionTest2 {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig2.class);
		
		NotificationFactory nf=act.getBean(NotificationFactory.class);
		
		
		nf.getNotifier(null).sendNotification("Hii");
		
		//Notifier n=nf.getNotifier("no");
	//	Notifier notifier = nf.getNotifier("msg");
		
	//	notifier.sendNotification("Hii");
		
		
//		System.out.println("================");
//		Notifier p=nf.getNotifier("pp");
//		p.sendNotification("New offer available in your app!");
//		System.out.println("=========================");
//		Notifier s=nf.getNotifier("ss");
//		s.sendNotification(" Your OTP is 4321.");
		

	}

}
