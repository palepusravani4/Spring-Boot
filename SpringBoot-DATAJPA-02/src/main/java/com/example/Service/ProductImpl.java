package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Entity.Product;
import com.example.Repository.ProductRepo;
@Component
public class ProductImpl implements ProductInterface{
    @Autowired
	private ProductRepo repo;
	
	
	@Override
	public Product addProduct(Product p) {
	
		return repo.save(p);
	}

	@Override
	public Integer getProductById(Integer id) {
		Optional<Product> i= repo.findById(id);
		 
		 return i.get().getProductId();
	}

	@Override
	public Iterable<Product> getAllProducts() {
     return repo.findAll();

		
	}

}
