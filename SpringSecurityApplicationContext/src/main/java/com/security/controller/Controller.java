package com.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
	@RequestMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("Welcome to Programe",HttpStatus.OK);
	}
	
	@RequestMapping("/user")
	public ResponseEntity<String> user(){
		return new ResponseEntity<String>("Welcome to User Page",HttpStatus.OK);
	}
}
