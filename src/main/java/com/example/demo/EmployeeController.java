package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	
    @PostMapping("/create-employees")
    public Employee createEmployee(@RequestBody Employee employee) {
       
    	Employee savedEmployee = employeeRepository.save(employee);
    	 
    	 return savedEmployee;
    }
    
    @GetMapping("/get-all-employees")
    public List<Employee> getAllEmployee(){
    	List<Employee> allEmployeelist = employeeRepository.findAll();
    	return allEmployeelist;
    	
    }

}
