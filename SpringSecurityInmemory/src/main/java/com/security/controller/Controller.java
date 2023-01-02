package com.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class Controller {

	@RequestMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("Welcome to Project",HttpStatus.OK);
	}
	@RequestMapping("/admin")
	public ResponseEntity<String> admin(){
		return new ResponseEntity<String>("Welcome Admin",HttpStatus.OK);
	}
	@RequestMapping("/user")
	public ResponseEntity<String> user(){
		return new ResponseEntity<String>("Welcome User",HttpStatus.OK);
	}
	@RequestMapping("/alluser")
	public ResponseEntity<String> allUser(){
		return new ResponseEntity<String>("Your are an authenticated User",HttpStatus.OK);
	}
}
