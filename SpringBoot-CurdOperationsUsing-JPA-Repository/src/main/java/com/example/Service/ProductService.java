package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Product;
import com.example.Repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	ProductRepository repo;

	public void addProduct(Product p) {
		repo.save(p);
	}
	
	public void addMultpleProducts(List<Product> p) {
		repo.saveAll(p);
	}
	public Optional<Product> findByProductId(int id) {
		return repo.findById(id);
		
	}
      public List<Product> viewAllProducts(){
    	  return repo.findAll();
      }
      public Product updateProductPrice(Integer id,Double price) {
    	  Product product = repo.findById(id).orElseThrow();
    	  product.setPrice(price);
    	  return repo.save(product);
      }
      public void deleteById(Integer id) {
    	  repo.deleteById(id);
      }
      public void deleteAllProducts() {
    	  repo.deleteAll();
      }
}
