package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.ServiceCentre;

public class DependencyInjectionTest3 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext2.xml");
		ServiceCentre sc=(ServiceCentre)ctx.getBean("sc");
		sc.performService();
		ctx.close();

	}

}
