package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails, Integer>{

}
