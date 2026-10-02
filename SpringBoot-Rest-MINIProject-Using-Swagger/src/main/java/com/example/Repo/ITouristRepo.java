package com.example.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Tourist;

import jakarta.transaction.Transactional;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

	@Query("from Tourist where city in(:c1,:c2,:c3) order by name asc")
	public List<Tourist> findTouristsByCities(String c1,String c2,String c3);
    @Query("from Tourist where name=:name")
	public List<Tourist> getTouristByName(@Param("name") String name);
    @Query("delete from Tourist where budget>=:start and budget<=:end")
    @Modifying
    @Transactional
    public int removeTouristsByBudgetRang(double start,double end);
}
