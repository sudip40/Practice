package com.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.post.exceptions.CityException;
import com.post.model.PostOfficeBean;
import com.post.service.PostOfficeServiceImpl;

@RestController
@RequestMapping("/post")
public class PostOfficeController {

	@Autowired
	private PostOfficeServiceImpl posi;
	
	@GetMapping("/{city}")
	public ResponseEntity<PostOfficeBean> getPostDetails(@PathVariable("city") String name) throws CityException{
		PostOfficeBean postOfficeBean= posi.fetchPostalDetailsByCityName(name);
		return new ResponseEntity<PostOfficeBean>(postOfficeBean,HttpStatus.FOUND);
	}
}
