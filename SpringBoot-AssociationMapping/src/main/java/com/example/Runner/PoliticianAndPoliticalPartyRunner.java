package com.example.Runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.PoliticalParty;
import com.example.Entity.Politician;
import com.example.Service.IpoliticianAndPoliticalPartyService;
@Component
public class PoliticianAndPoliticalPartyRunner implements CommandLineRunner {
	@Autowired
	IpoliticianAndPoliticalPartyService service;

	@Override
	public void run(String... args) throws Exception {
	     PoliticalParty pp1=new PoliticalParty("ysrcp","fan");
	     Politician p1=new Politician("jagan","hyd",40);
	     Politician p2=new Politician("priya","ong",25);
	     Politician p3=new Politician("satya","godavari",24);
	     pp1.setPolitician(Set.of(p1,p2,p3));
	     
	     p1.setParty(pp1);p2.setParty(pp1);p3.setParty(pp1);
	     
	     service.savePoliticalParty(pp1);
	     service.savePolitician(p1, p2);
	     
		
	}

}
