package com.example.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class BillingServiceOperation {
	@Autowired
	private LoadBalancerClient client;
	public String getBillingInfo() {
		ServiceInstance list=client.choose("ProducerLoadBalancer");
		URI si=list.getUri();
		String url=si.toString()+"/bill-api/info";
		RestTemplate temp=new RestTemplate();
		ResponseEntity<String> rest=temp.getForEntity(url, String.class);
		String response=rest.getBody();
		return response;
	}

}
