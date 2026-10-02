package com.example.Runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Product;
import com.example.Service.ProductImpl;
@Component
public class ProductRunner implements CommandLineRunner{
   @Autowired
   ProductImpl pro;
	
	@Override
	public void run(String... args) throws Exception {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== PRODUCT INVENTORY SYSTEM =====\r\n"
				+ "1. Add Product\r\n"
				+ "2. View Product\r\n"
				+ "3. View All Products\r\n"
				+ "");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1->{
			Product p1=new Product();
			p1.setProductName("mobile"); p1.setProdcolor("blue"); p1.setQty(2);p1.setPrice(50000.0);
//			Product p2=new Product(102,"mobile","blue",2,50000.0);
//			Product p3=new Product(103,"mobile","blue",2,50000.0);
			pro.addProduct(p1);
//			pro.addProduct(p2);
//			pro.addProduct(p3);
		}
		case 2->{
			int id=sc.nextInt() ;
			
			System.out.println(pro.getProductById(id));
		}
		case 3->{
			Iterable<Product> allProducts = pro.getAllProducts();
			allProducts.forEach(n->{System.out.println(n);});
		}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
