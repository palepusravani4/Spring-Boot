package com.task.config;

import org.springframework.context.annotation.*;



@Configuration
@ComponentScan(basePackages = "com.task")
@PropertySource("classpath:com/task/commons/strategy.properties")
public class AppConfig {


}

