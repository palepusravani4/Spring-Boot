package com.nit.sbeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("efactory")
public class EngineFactory implements FactoryBean<IEngine>{

	@Value("${engg.type}")
	private String type;
	@Override
	public IEngine getObject() throws Exception {
		System.out.println("EngineFactory.getObject()");
		if(type.equalsIgnoreCase("petrol")) {
			return new PetrolEngine();
		}
		else if(type.equalsIgnoreCase("diesel")) {
		return new DieselEngine();
	}
		else if(type.equalsIgnoreCase("electric")) {
			return new ElectricEngine();
			}
		else {
			throw new IllegalArgumentException("Invalid type");
		}
		}

	@Override
	public Class<?> getObjectType() {
		System.out.println("EngineFactory.getObjectType()");
		return IEngine.class;
	}
	@Override
	public boolean isSingleton() {
		System.out.println("EngineFactory.isSingleton()");
		return true;
	}

}
