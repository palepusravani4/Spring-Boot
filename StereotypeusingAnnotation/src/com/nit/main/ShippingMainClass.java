package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.comonent.ShippingService;
import com.nit.configuration.Appconfig3;

public class ShippingMainClass {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig3.class);
		
		ShippingService sp=ctx.getBean(ShippingService.class);
		double air=sp.getShippingCost("air",5.0);
		System.out.println("Air Shipping Cost:"+air);
		double sea=sp.getShippingCost("sea",5.0);
		System.out.println("Sea Shipping Cost:"+sea);
		double road=sp.getShippingCost("road",5.0);
		System.out.println("Road Shipping Cost:"+road);



	}

}
