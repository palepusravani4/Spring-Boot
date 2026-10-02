package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	public List<Employee> findByDepartmentIs(String dept);
	public List<Employee> getByDepartmentEquals(String dept);
	public List<Employee> readByDepartment(String dept);
	
	public Iterable<Employee> findBySalaryBetween(double start,double end);
	public Iterable<Employee> findByNameStartingWith(String name);
	public Iterable<Employee> findByNameEndingWith(String name);
	public Iterable<Employee> findByNameContaining(String name);
	public Iterable<Employee> findByDepartmentInOrderByDepartmentDesc(List<String> dept);
	public Iterable<Employee> findByNameLikeAndSalaryBetween(String name,double start,double end);
	
	
	
	

}
