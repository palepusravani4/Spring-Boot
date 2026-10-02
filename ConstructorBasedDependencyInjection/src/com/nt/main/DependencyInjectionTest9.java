package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig5;
import com.nt.day1.sbeans.MusicBand;

public class DependencyInjectionTest9 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig5.class);
		MusicBand m=act.getBean("i4",MusicBand.class);
		m.showbandDetails();

	}

}
