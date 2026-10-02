package com.example.Entity;

import java.util.Date;

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
@Table(name="OrderInfo")
public class Order {
	@Id
	private Integer orderId;
	private String customerName;
	private String orderStatus;
	private String paymentMode;
	private double totalAmount;
	private Date orderDate; 

}
