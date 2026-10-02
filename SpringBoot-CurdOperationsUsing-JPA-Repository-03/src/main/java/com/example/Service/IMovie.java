package com.example.Service;

import java.util.List;
import java.util.Optional;

import com.example.Entity.Movie;

public interface IMovie {
	void addAllMovies(List<Movie> movies);

    Optional<Movie> findByNo(Integer no);

    List<Movie> findByHero(String hero);

    List<Movie> findByHeroine(String heroine);

    List<Movie> findByDaysBetween(Integer start, Integer end);

    Optional<Movie> totalBudget(Integer Id,Double budget);}
