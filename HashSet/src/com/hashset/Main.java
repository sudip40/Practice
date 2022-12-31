package com.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
     Set<Integer> set=new HashSet<>();
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(4);
     set.add(1);
     set.add(2);
     System.out.println(set);
     System.out.println("================================================");
     
     Set<String> set2=new HashSet<>();
     set2.add("Sudip");
     set2.add("Rahul");
     set2.add("Raju");
     set2.add("Suman");
     set2.add("Tanya");
     set2.add("Suman");
     System.out.println(set2);
     System.out.println("====================================================");
     
     Set<Employee> emp=new HashSet<>();
     Employee e1=new Employee(1,"Dipa",1000);
		Employee e2=new Employee(2,"Priya",2000);
		Employee e3=new Employee(1,"Dipa",1000);
		Employee e4=new Employee(2,"Priya",2000);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		System.out.println(emp);
	}
}
