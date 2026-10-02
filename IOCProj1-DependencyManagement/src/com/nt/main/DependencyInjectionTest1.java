package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGeneratorSeason;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext1.xml");
		Object obj=ctx.getBean("wm");
		WishMessageGeneratorSeason gen=(WishMessageGeneratorSeason)obj;
		String msg=gen.showWishMessage("sri");
		System.out.println(msg);

	}

}
