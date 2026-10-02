package com.example.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class ProductDetails {
	@Id
	@SequenceGenerator(name="gen1", initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer productId;
	@NonNull
	private String productName;
	@NonNull
	private Double price;
	
	@Version
	Integer updationCount;
	@CreationTimestamp
	@Column(insertable = true, updatable = false)
	private LocalDateTime createdAt;
	@UpdateTimestamp
	@Column(insertable = false,updatable = true)
	private LocalDateTime updatedAt;
	
	private String createdBy;
	private String updatedBy;
	
	
	

}
