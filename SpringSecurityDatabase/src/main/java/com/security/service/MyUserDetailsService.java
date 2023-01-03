package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.model.Employee;
import com.security.model.MyUserDetails;
import com.security.repo.EmployeeRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private EmployeeRepo er;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee e=er.findByUserName(username);
		if(e!=null) {
			return new MyUserDetails(e);
		}
		else {
			throw new UsernameNotFoundException("User not present with username "+username);
		}
	}

}
