package com.example.demo.sbeans;

import org.springframework.stereotype.Component;

@Component
public class MembershipService {
	public double getBaseFee(String type) {
		switch(type) {
		case "BASIC":return 500;
		case "STANDARD":return 800;
		case "PREMIUM":return 1200; 
		default:throw new IllegalArgumentException("Invalid type:"+type);
		}
	}
  public double getTrainerFee(boolean personalTrainer) {
	  if(personalTrainer==true) {
		  return 600;
	  }
	  else {
		  return 0;
	  }
  }


}
