package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Entity.Employee;
import com.example.Service.IEmployeeMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationsController {
    @Autowired
	private IEmployeeMgmtService service;
    @GetMapping("/")
    public String showHome() {
    	return "home";
    	}
    @GetMapping("/emp_report")
    public String showEmployee(Map<String,Object> map) {
    	    
    	Iterable<Employee> emp=service.getAllEmployee();
    	 
    	map.put("emplist", emp);
    	return "show_employee_report";
    }
    @GetMapping("/emp_add")
	public String showFormForsaveEmployee(@ModelAttribute("emp") Employee emp) {
		return "register_employee";
	}
    @PostMapping("/emp_add")
    public String saveEmployee(@ModelAttribute("emp") Employee emp,Map<String,Object>map) {
    	String msg=service.registerEmployee(emp);
    	Iterable<Employee> it=service.getAllEmployee();
    	map.put("resultMsg", msg);
    	map.put("emplist", it);
    	return "show_employee_report";
    }
//    @PostMapping("/emp_add")
//    public String savefirstEmployee(@ModelAttribute("emp") Employee emp,Map<String,Object>map) {
//    	System.out.println("EmployeeOperarionsController.saveEmployee()");
//    	String msg=service.registerEmployee(emp);
//    	
//    	map.put("resultMsg", msg);
//    	
//    	return "redirect:emp_report";
//    }
//    @GetMapping("/emp_report")
//    public String showEmployeeData(Map<String,Object>map) {
//    	System.out.println("Show Employee Report");
//    	
//    	Iterable<Employee> it=service.getAllEmployee();
//    	
//    	map.put("emplist", it);
//    	return "show_employee_report";
//    }
    
//    @PostMapping("/emp_add")
//    public String saveanotherEmployee(@ModelAttribute("emp") Employee emp,RedirectAttributes attrs) {
//    	System.out.println("Employee operations.saveEmployee()");
//    	String msg=service.registerEmployee(emp);
//    	attrs.addFlashAttribute("resultMsg", msg);
//    	return "redirect:emp_report";
//    }
//    @GetMapping("/emp_report")
//    public String showEmployeeReport(Map<String,Object> map) {
//    	System.out.println("employee save report");
//    	Iterable<Employee> it=service.getAllEmployee();
//    	map.put("emplist", it);
//    	return "show_employee_report";
//    }
    
//    @PostMapping("/emp_add")
//    public String saveEmployeerecord(@ModelAttribute("emp") Employee emp,HttpSession ses) {
//    	System.out.println("Employee operations.saveEmployee()");
//    	String msg=service.registerEmployee(emp);
//    	ses.setAttribute("resultMsg", msg);
//    	return "redirect:emp_report";
//    }
//    @GetMapping("/emp_report")
//    public String showtheEmployee(Map<String,Object> map) {
//    	System.out.println("employee save report");
//    	Iterable<Employee> it=service.getAllEmployee();
//    	map.put("emplist", it);
//    	return "show_employee_report";
//    }
    
   
}
