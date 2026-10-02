package com.nt.main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          FileSystemXmlApplicationContext ctx=new  FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
         Object obj= ctx.getBean("wmg");
         WishMessageGenerator g=(WishMessageGenerator)obj;
         String str=g.showWishMessage("sri");
         System.out.println(str);
         System.out.println("All beans Count :"+ctx.getBeanDefinitionCount());
         System.out.println("All beans Name :"+Arrays.toString(ctx.getBeanDefinitionNames()));
         ctx.close();
	}

}
