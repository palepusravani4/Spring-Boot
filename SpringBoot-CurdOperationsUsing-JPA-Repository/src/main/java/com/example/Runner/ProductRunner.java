package com.example.Runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Product;
import com.example.Service.ProductService;
@Component
public class ProductRunner implements CommandLineRunner {
    @Autowired
	ProductService service;
	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			Product p=new Product(102,"clock","titan",50000.0,1);
			Product p1=new Product(103,"conditioner","livon",500.0,2);
			service.addProduct(p);
			service.addProduct(p1);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
//		try {
//			Optional<Product> byProductId = service.findByProductId(103);
//			if(byProductId.isPresent()) {
//				 System.out.println(byProductId+"product is available");
//			}else {
//			System.out.println(byProductId+"product not is available");
//		}}
//		catch(Exception e) {
//			e.printStackTrace();}
	//}
//	try {
//		List<Product> viewAllProducts = service.viewAllProducts();
//		viewAllProducts.forEach(System.out::println);
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
//		try {
//			Product updateProductPrice = service.updateProductPrice(101,4000.0);
//			System.out.println(updateProductPrice);
//		}catch(Exception e) {
//			e.printStackTrace();
//			}
		try {
			service.deleteAllProducts();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
