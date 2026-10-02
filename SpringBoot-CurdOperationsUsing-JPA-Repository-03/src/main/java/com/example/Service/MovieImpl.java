package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Entity.Movie;
import com.example.Repository.MovieRepository;

public class MovieImpl implements IMovie {
	  @Autowired
       MovieRepository mov;

	  @Override
	  public void addAllMovies(List<Movie> movies) {
		mov.saveAll(movies);
		
	  }

	  @Override
	  public Optional<Movie> findByNo(Integer no) {
	
		return mov.findById(no);
	  }

	  @Override
	  public List<Movie> findByHero(String hero) {
	
		return mov.findAll();
	  }

	  @Override
	  public List<Movie> findByHeroine(String heroine) {
		
		return mov.findAll();
	  }

	  @Override
	  public List<Movie> findByDaysBetween(Integer start, Integer end) {
		
		return mov.findByDaysBetween(start, end);
	  }

	  @Override
	  public Optional<Movie> totalBudget(Integer Id,Double budget) {
		
		return mov.findById(Id);
	  }
	
}
