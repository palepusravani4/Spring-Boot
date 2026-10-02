package com.example.Runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Repository.IOrderRepository;



@Component
public class OrderRunner implements CommandLineRunner {
	@Autowired
	IOrderRepository repo;

	@Override
	public void run(String... args) throws Exception {
		try {
//	List<Order> multiple = List.of(new Order(101,"smith","PLACED","COD",50000.0,Date.valueOf("2012-12-21")),
//					new Order(102,"allen","SHIPPED","UPI",60000.0,Date.valueOf("2013-11-15")),new Order(103,"blake","DELIVERED","CARD",70000.0,Date.valueOf("2014-05-08")));
//			
//			repo.saveAll(multiple);
			repo.findByCustomerNameContaining("s").forEach(System.out::println);
			System.out.println("--------------------------------------");
			repo.findByTotalAmountGreaterThan(50000.0).forEach(System.out::println);
			System.out.println("-----------------------------------");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			repo.findByOrderDateBetween(simpleDateFormat.parse("2012-11-21"),simpleDateFormat.parse("2013-11-20")).forEach(System.out::println);
			System.out.println("------------------------------");
			repo.getByOrderStatusEquals("PLACED").forEach(System.out::println);
			System.out.println("-----------------------------------");
			repo.readByPaymentMode("UPI").forEach(System.out::println);
			
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
