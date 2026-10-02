package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee_info")
public class Employee {
	@Id
	Integer employeeId;
	@Column(name="name",length=20)
	String name;
	@Column(name="department",length=20)
	String department;
	@Column(name="salary")
	double salary;
	@Column(name="dateOfJoining",length=20)
	String dateOfJoining;
}
