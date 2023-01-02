package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	  http.authorizeHttpRequests((auth)->auth
			  .antMatchers("/work/admin").hasAuthority("admin")
			  .antMatchers("/work/user").hasAuthority("user")
			  .antMatchers("/work/alluser").authenticated()
			  .antMatchers("/work/welcome").permitAll()).httpBasic();
	  return http.build();
  }
  
  @Bean
  public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
	  InMemoryUserDetailsManager userDetails=new InMemoryUserDetailsManager();
	  UserDetails user=User.withUsername("user").password("1234").authorities("user").build();
	  UserDetails admin=User.withUsername("admin").password("12345").authorities("admin").build();
	  userDetails.createUser(user);
	  userDetails.createUser(admin);
	  return userDetails;
  }
  
  @Bean
  public PasswordEncoder passwordEncoder() {
	  return NoOpPasswordEncoder.getInstance();
  }
}
