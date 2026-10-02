package com.example.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "employee")
public class Employee {
	@Id
	private String id;
	@NonNull
	private String name;
	@NonNull
	private String eaddr;
	@NonNull
	private Double salary;
	@NonNull
	private String company;

}
