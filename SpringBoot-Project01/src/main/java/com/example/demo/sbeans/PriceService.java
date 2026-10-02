package com.example.demo.sbeans;

import org.springframework.stereotype.Component;

@Component
public class PriceService {
	
   public double calculateUnitCost(int units) {
	   if(units<100) {
		   return units*5;
	   }
	   else if(units>=101&&units<=200) {
		   return (100*5)+(units-100)*7;
	   }
	   else {
		   return units*10;
	   }
   }
   public double calculateFixedCharge() {
	   return 50;
   }


}
