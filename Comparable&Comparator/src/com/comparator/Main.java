package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.comparable.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		 emp.add(new Employee(1,"Sudip",5000));
	     emp.add(new Employee(5,"Rabi",6000));
	     emp.add(new Employee(2,"Sumit",7000));
	     emp.add(new Employee(4,"Amit",1000));
	     emp.add(new Employee(6,"Sudip",2000));
	     System.out.println("Unsorted : "+emp);
	     Collections.sort(emp,(Employee e1,Employee e2)->e1.getName().compareTo(e2.getName()));
	     System.out.println("Sort By Name : "+emp);
	     
	     Collections.sort(emp,(Employee e1,Employee e2)->e1.getEid()-e2.getEid());
	     System.out.println("Sort By ID : "+emp);
	     
	     Collections.sort(emp,(Employee e1,Employee e2)->e1.getSalary()-e2.getSalary());
	     System.out.println("Sort By Salary : "+emp);
	}

}
