package com.example.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Order;



public interface IOrderRepository extends JpaRepository<Order, Integer> {
	
	public List<Order> getByOrderStatusEquals(String status);
	public List<Order> readByPaymentMode(String mode);
	
	public Iterable<Order> findByTotalAmountGreaterThan(double start);
	
	public Iterable<Order> findByCustomerNameContaining(String name);
	public Iterable<Order> findByOrderDateBetween(Date start,Date end);
	
	
	
	

}
