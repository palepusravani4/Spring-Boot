package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.Product;

public interface ProductRepo extends CrudRepository<Product,Integer> {

}
