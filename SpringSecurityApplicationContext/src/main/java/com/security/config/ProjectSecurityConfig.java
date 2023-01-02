package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests((auth)->auth
				.antMatchers("/user").authenticated()
				.antMatchers("/welcome").permitAll())
		.httpBasic();
		return http.build();
	}
	
	
}
