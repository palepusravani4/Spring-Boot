package com.nt.Appconfig;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.day1.sbeans.Instrument;
import com.nt.day1.sbeans.MusicBand;

@Configuration
public class AppConfig5 {
	@Bean("i1")
     public Instrument in1() {
    	 Instrument i=new Instrument("Guitar","String");
    	 return i;
    	 
     }
	@Bean("i2")
     public Instrument in2() {
    	 Instrument i=new Instrument("Drums","Percussion");
    	 return i;
    	 
     }
	@Bean("i3")
     public Instrument in3() {
    	 Instrument i=new Instrument("Keyboard","Electronic");
    	 return i;
    	 
     }
	@Bean("i4")
     public MusicBand mu() {
    	 MusicBand m=new MusicBand("RockNation",List.of(in1(),in2(),in3()));
    	 return m;
     }
}
