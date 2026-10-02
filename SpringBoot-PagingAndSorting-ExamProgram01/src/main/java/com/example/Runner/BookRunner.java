package com.example.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.example.Entity.Book;
import com.example.Repository.BookRepository;
@Component
public class BookRunner implements CommandLineRunner {
    @Autowired
	BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		try {
		
//			Book b1=new Book("c","kishore",60000.0,"it");
//			Book b2=new Book("spring","nataraz",70000.0,"it");
//			Book b3=new Book("journey","jhon",10000.0,"non-it");
//			Book b4=new Book("self-motivation","Alia",90000.0,"non-it");
		   Pageable p=PageRequest.of(1, 3);
			Page<Book> page=repo.findAll(p);
			page.forEach(System.out::println);
			repo.findByAuthorIn(List.of("ravi","kishore")).forEach(System.out::println);
			repo.findByCategoryIn(List.of("it")).forEach(System.out::println);
			repo.findByPriceGreaterThan(50000.0).forEach(System.out::println);
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
