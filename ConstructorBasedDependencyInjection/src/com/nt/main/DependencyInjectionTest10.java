package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig6;
import com.nt.day1.sbeans.NotificationService;

public class DependencyInjectionTest10 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig6.class);
          NotificationService n=act.getBean("nn",NotificationService.class);
          n.notifyUser("Meeting at 10 pm");
	}

}
