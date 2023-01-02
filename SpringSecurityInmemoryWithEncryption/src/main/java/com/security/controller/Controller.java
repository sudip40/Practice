package com.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {
	@RequestMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("Welcome to our page", HttpStatus.OK);
	}
    
	@RequestMapping("/user")
	public ResponseEntity<String> user() {
		return new ResponseEntity<String>("Welcome User", HttpStatus.ACCEPTED);
	}

	@RequestMapping("/admin")
	public ResponseEntity<String> admin() {
		return new ResponseEntity<String>("Welcome Admin", HttpStatus.OK);
	}

	@RequestMapping("/alluser")
	public ResponseEntity<String> allUser() {
		return new ResponseEntity<String>("You are authenticated", HttpStatus.OK);
	}
}
