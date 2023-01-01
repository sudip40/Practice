package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		 emp.add(new Employee(1,"Sudip",5000));
	     emp.add(new Employee(5,"Rabi",6000));
	     emp.add(new Employee(2,"Sumit",7000));
	     emp.add(new Employee(4,"Amit",1000));
	     emp.add(new Employee(6,"Sudip",2000));
         System.out.println("Unsorted : ");
	     System.out.println(emp);
	     System.out.println("Sorted : ");
	     Collections.sort(emp);
	     System.out.println(emp);
	}

}
