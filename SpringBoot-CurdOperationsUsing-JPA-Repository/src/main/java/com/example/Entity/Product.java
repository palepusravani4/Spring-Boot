package com.example.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product111")
public class Product {
	@Id
	Integer productid;
	@Column(name="pname",length=10)
	String productName;
	@Column(name="pbrand",length=10)
	String brand;
	@Column(name="pprice",length=8)
	Double price;
	@Column(name="pstock",length=5)
	Integer stock;

}
