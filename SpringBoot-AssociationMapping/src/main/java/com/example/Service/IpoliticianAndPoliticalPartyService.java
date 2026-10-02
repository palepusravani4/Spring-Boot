package com.example.Service;

import java.util.List;

import com.example.Entity.PoliticalParty;
import com.example.Entity.Politician;

public interface IpoliticianAndPoliticalPartyService {
	
	public String savePoliticalParty(PoliticalParty p);
	public String savePolitician(Politician p1,Politician p2);
	public List<PoliticalParty> showAllPoliticalParty();
	public List<Politician> showAllPolitician();

}
