package com.post.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.post.exceptions.CityException;
import com.post.model.PostOfficeBean;
import com.post.model.PostOfficeDetails;

@Service
public class PostOfficeServiceImpl implements PostOfficeService{

	@Override
	public PostOfficeBean fetchPostalDetailsByCityName(String name) throws CityException {
		String url="https://api.postalpincode.in/postoffice/{City}";
		url=url.replace("{City}",name);
		System.out.println(url);
		RestTemplate restTemplate=new RestTemplate();
		PostOfficeBean[] list=restTemplate.getForObject(url,PostOfficeBean[].class);
		System.out.println(list[0]);
		return list[0];
	}

}
