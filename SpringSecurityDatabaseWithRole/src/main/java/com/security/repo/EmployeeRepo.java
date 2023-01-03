package com.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public Employee findByUserName(String userName);
}
