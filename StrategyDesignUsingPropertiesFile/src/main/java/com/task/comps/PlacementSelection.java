package com.task.comps;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@Component("selection")
public class PlacementSelection implements FactoryBean<PlacementStrategy> {
	  
	   @Value("${placement.type}")
       private String type; 
	   
	   @Autowired
	   private BeanFactory beanFactory;
	
	@Override
	public @Nullable PlacementStrategy getObject() throws Exception {
		switch(type) {
		case "it" :
			return beanFactory.getBean("it",PlacementStrategy.class);
		case "core" :
			return beanFactory.getBean("core",PlacementStrategy.class);
		case "mgmt" :
			return beanFactory.getBean("mgmt",PlacementStrategy.class);
		default : 
			 throw new IllegalAccessException("Invalid type");
		}
		
		
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		
		return PlacementStrategy.class;
	}

	
}
