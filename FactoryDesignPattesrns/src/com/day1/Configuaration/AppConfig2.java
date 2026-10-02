package com.day1.Configuaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.day1.sbeans1")
@ImportResource("com/nit/cfg/applicationcontext.xml")
public class AppConfig2 {

}
