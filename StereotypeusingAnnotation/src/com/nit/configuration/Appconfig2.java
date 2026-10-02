package com.nit.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nit")
@PropertySource("com/nit/commons/info2.properties")
public class Appconfig2 {

}
