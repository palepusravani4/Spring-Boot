package com.nt.Appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages= "com.nt")
@ImportResource("com/nt/commons/applicationcontext.xml")
public class Appconfig {

}
