package com.example.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="Doctor_Info")
@Data
@Entity
public class Doctor {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//@Column(name="name" ,length = 20)
	private String name;
	//@Column(name="specification",length = 20)
	private String specification;
	//@Column(name = "income", precision = 10, scale = 2)
	private Double income;

}
