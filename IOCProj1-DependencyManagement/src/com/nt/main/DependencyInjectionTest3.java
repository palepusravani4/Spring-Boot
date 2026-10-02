package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGeneratorUsingConstructorInjection;


public class DependencyInjectionTest3 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext3.xml");
		Object obj=ctx.getBean("wmg");
		WishMessageGeneratorUsingConstructorInjection generator=(WishMessageGeneratorUsingConstructorInjection)obj;
		String name=generator.showWishMessage("raja");
		System.out.println(name);
		ctx.close();


	}

}
