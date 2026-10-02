package com.example.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	 // public Page<Book> findAll(int pageSize,int pageNo);
	 
     public List<Book> findByAuthorIn(List<String> author);
     public List<Book> findByCategoryIn(List<String> cate);
     public List<Book> findByPriceGreaterThan(double price);
     
}
