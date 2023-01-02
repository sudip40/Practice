package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((auth)->auth
				.antMatchers("/app/admin").hasAuthority("admin")
				.antMatchers("/app/user").hasAuthority("user")
				.antMatchers("/app/alluser").authenticated()
				.antMatchers("/app/welcome").permitAll()).httpBasic();
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
	   InMemoryUserDetailsManager userDetails=new InMemoryUserDetailsManager();
	   UserDetails user=User.withUsername("user").password(this.passwordEncoder().encode("user1234")).authorities("user").build();
	   UserDetails admin=User.withUsername("admin").password(this.passwordEncoder().encode("admin1234")).authorities("admin").build();
	   userDetails.createUser(user);
	   userDetails.createUser(admin);
	   return userDetails;
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
