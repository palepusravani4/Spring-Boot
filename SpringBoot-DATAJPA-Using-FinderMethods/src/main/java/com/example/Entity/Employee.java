package com.example.Entity;

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
@Table(name="emp_information")
public class Employee {
	@Id
	private Integer employeeId;
	private String name;
	private String department;
	private double salary;
	private String DateOfJoining; 

}
