package com.example.Service;

import com.example.Entity.Product;

public interface ProductInterface {
	
	public Product addProduct(Product p);
	public Integer getProductById(Integer id);
	public Iterable<Product> getAllProducts();


     
}
