package com.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PostOfficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostOfficeApplication.class, args);
	}
}
