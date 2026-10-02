package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class BillingServiceOperation {
	@Autowired
	private DiscoveryClient client;
	public String getBillingInfo() {
		List<ServiceInstance> list=client.getInstances("ProducerMS");
		ServiceInstance si=list.get(0);
		String url=si.getUri()+"/bill-api/info";
		RestTemplate temp=new RestTemplate();
		String rest=temp.getForObject(url, String.class);
		return rest;
	}

}
