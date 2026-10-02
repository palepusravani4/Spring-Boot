package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

	 public List<Movie> findByDaysBetween(Integer start, Integer end);
	

}
