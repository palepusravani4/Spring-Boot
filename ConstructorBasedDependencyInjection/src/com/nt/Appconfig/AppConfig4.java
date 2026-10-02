package com.nt.Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.day1.sbeans.Doctor;
import com.nt.day1.sbeans.Equipment;
import com.nt.day1.sbeans.Hospital;

@Configuration
public class AppConfig4 {
	@Bean("dd")
	public Doctor doc() {
		Doctor d=new Doctor(" Dr. Meena Gupta","Cardiologist");
		return d;
		
	}
	@Bean("ee")
    public Equipment equ() {
    	Equipment e=new Equipment("ECG Machine",250000);
    	return e;
    }
	@Bean("hh")
    public Hospital hos() {
    	Hospital h=new Hospital("City Care Hospital",doc(),equ());
    	return h;
    }
}
