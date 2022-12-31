package com.tree;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
     Map<String,Integer> tm=new TreeMap<>();
     tm.put("Sumit",1);
     tm.put("Pradeep",2);
     tm.put("Sudip",3);
     tm.put("Dipa",4);
     tm.put("Rahul",5);
     tm.put("Amit",6);
     tm.put("Amit",7);
     System.out.println(tm);
     System.out.println("============================================");
     Map<Integer,String> tm1=new TreeMap<>();
     tm1.put(1,"Sumit");
     tm1.put(2,"Pradeep");
     tm1.put(3,"Sudip");
     tm1.put(4,"Dipa");
     tm1.put(5,"Rahul");
     tm1.put(6,"Amit");
     tm1.put(7,"Amit");
     System.out.println(tm1);
     System.out.println("============================================");
     
     Map<Employee,Integer> emp=new TreeMap<>();
     emp.put(new Employee(1,"Sudip",5000),1);
     emp.put(new Employee(5,"Rabi",6000),2);
     emp.put(new Employee(2,"Sumit",7000),3);
     emp.put(new Employee(4,"Amit",1000),4);
     emp.put(new Employee(6,"Sudip",2000),5);
     
     System.out.println(emp);
	}
}
