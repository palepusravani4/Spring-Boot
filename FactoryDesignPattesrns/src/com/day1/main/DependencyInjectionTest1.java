package com.day1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.day1.Configuaration.AppConfig1;
import com.day1.sbeans.Appliance;
import com.day1.sbeans.ApplianceFactory;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext act=new AnnotationConfigApplicationContext(AppConfig1.class);
		ApplianceFactory af=act.getBean(ApplianceFactory.class);
         Appliance a= af.getAppliance("WW");
         a.manufacture();
         System.out.println("==================");
         Appliance a1= af.getAppliance("rr");
         a1.manufacture();
	}

}
