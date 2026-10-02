package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.PoliticalParty;
import com.example.Entity.Politician;
import com.example.Repository.IPoliticalPartyRepository;
import com.example.Repository.IPoliticianRepository;
@Service
public class PoliticalPartyImpl implements IpoliticianAndPoliticalPartyService{
	@Autowired
	IPoliticalPartyRepository partyrepo;
	@Autowired
	IPoliticianRepository politicianrepo;

	@Override
	public String savePoliticalParty(PoliticalParty p) {
		int id=partyrepo.save(p).getPid();
		
		return "politicalparty is saved with id value : "+id;
	}

	@Override
	public String savePolitician(Politician p1, Politician p2) {
	          politicianrepo.saveAll(List.of(p1,p2));
		return "politicians are saved";
	}

	@Override
	public List<PoliticalParty> showAllPoliticalParty() {
		
		return partyrepo.findAll();
	}

	@Override
	public List<Politician> showAllPolitician() {
		// TODO Auto-generated method stub
		return politicianrepo.findAll();
	}

}
