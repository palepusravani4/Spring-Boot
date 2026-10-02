package com.example.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="emp_data")
@Data
public class Employee implements Serializable {
	@Id
	@SequenceGenerator(name="g1",sequenceName ="e_seq",initialValue =1000,allocationSize = 1)
	@GeneratedValue(generator = "g1",strategy =GenerationType.SEQUENCE)
	private Integer empno;
	private String ename;
	private String job;
	private Float sal;
	private Integer deptno;
	

}
