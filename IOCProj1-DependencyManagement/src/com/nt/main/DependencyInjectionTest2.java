package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGeneratorUsingSetterInjection;

public class DependencyInjectionTest2 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext2.xml");
		Object obj=ctx.getBean("wmg");
		WishMessageGeneratorUsingSetterInjection generator=(WishMessageGeneratorUsingSetterInjection)obj;
		String name=generator.showWishMessage("raja");
		System.out.println(name);
		ctx.close();

	}

}
