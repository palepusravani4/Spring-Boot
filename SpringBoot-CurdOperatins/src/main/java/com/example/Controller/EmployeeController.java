package com.example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Employee;
import com.example.Service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService ser;
    @PostMapping("/e1")
	public Employee saveEmployee(@RequestBody Employee e) {
		return ser.saveEmployee(e);
	}
    @GetMapping("/e2")
	public List<Employee> getAllEmployees(){
		return ser.getAllEmployees();
	}
    @GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Long id){
		return ser.getEmployeeById(id);
	}
    @PutMapping("/{id}")
	public Employee updateEmployeeById(@PathVariable Long id,Employee e) {
		return ser.updateEmployeeById(id, e);
	}
    @DeleteMapping("/{id}")
	public String deleteById(@PathVariable Long id) {
		
    	return ser.deleteById(id);
		
    }
}
