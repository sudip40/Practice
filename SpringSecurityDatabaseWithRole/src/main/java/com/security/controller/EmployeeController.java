package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Employee;
import com.security.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepo er;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/register")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		emp.setPassword(passwordEncoder.encode(emp.getPassword()));
		Employee e= er.save(emp);
		return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("Welcome to the Application",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/welcomeP")
	public ResponseEntity<String> welocmeP(){
		return new ResponseEntity<String>("Welcome, You are an authenticated user",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin(){
		return new ResponseEntity<String>("Welcome Admin",HttpStatus.ACCEPTED);
	}
}
