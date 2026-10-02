package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExceptonHandling.TouristNotFoundException;
import com.example.Repo.ITouristRepo;
import com.example.entity.Tourist;
@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService{
    @Autowired
	ITouristRepo repo;
	
	
	@Override
	public String registerTourist(Tourist tt) {
		int id= repo.save(tt).getTid();
		return "Tourist is registered having the id value :: "+id;
	}


	@Override
	public List<Tourist> fetchAllTourists() {
		List<Tourist> list = repo.findAll();
		list.sort((s1,s2)->s1.getTid().compareTo(s2.getTid()));
		return list;
	}


	@Override
	public List<Tourist> showAllTourist(String c1, String c2, String c3) {
		
		return repo.findTouristsByCities(c1, c2, c3);
	}


	@Override
	public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException {
		
		return repo.findById(tid).orElseThrow(()->new TouristNotFoundException(tid+" tourist not found"));
	}


	@Override
	public String updateTouristDetails(Tourist tt) throws TouristNotFoundException {
		Optional<Tourist> byId = repo.findById(tt.getTid());
		if(byId.isPresent()) {
			repo.save(tt);
			return tt.getTid()+"Tourist is Updated";
		}else {
		throw new TouristNotFoundException() ;
	}
	}


	@Override
	public List<Tourist> findAllTouristByName(String name) {
		return repo.getTouristByName(name);
		
	}


	@Override
	public String updateTouristBudgetById(int tid, double hikeper) throws TouristNotFoundException {
          Optional<Tourist> opt=repo.findById(tid);
          if(opt.isPresent()) {
        	  Tourist tt=opt.get();
        	  double budget=tt.getBudget();
        	  double newbudget=budget+(budget*hikeper/100.0);
        	  tt.setBudget(newbudget);
        	 repo.save(tt);
        	 return "Tourist budget is hiked ... and the new budget is "+newbudget;
        	 }
          else {
		throw new TouristNotFoundException(tid+" tourist id is not found for updation");
	}}


	@Override
	public String removeTouristById(int id) throws TouristNotFoundException {
		  Optional<Tourist> byId = repo.findById(id);
		if(byId.isPresent()) {
		
		repo.deleteById(id);
		return id+"tourist id is found and deleted";
	}else {
		throw new TouristNotFoundException(id+" tourist id is not found for deletion");
	}
}


	@Override
	public String removeTouristsByBudgetRang(double start, double end) {
		int count= repo.removeTouristsByBudgetRang(start, end);
		return count==0?" Tourist not found for deletion ":count+"no.of tourists are found and deleted";
	}}
