package com.example.Service;

import java.util.List;

import com.example.ExceptonHandling.TouristNotFoundException;
import com.example.entity.Tourist;

public interface ITouristMgmtService {
	
	public String registerTourist(Tourist tt);
	public List<Tourist> fetchAllTourists();
	public List<Tourist> showAllTourist(String c1,String c2,String c3);
    public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException;
    public String updateTouristDetails(Tourist tt)throws TouristNotFoundException;
   public List<Tourist> findAllTouristByName(String name);
   public String updateTouristBudgetById(int tid,double hikeper)throws TouristNotFoundException;
   public String removeTouristById(int id)throws TouristNotFoundException;
   public String removeTouristsByBudgetRang(double start,double end);
}
