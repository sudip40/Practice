package com.cloneable;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(1,"Sudip","Sudip40");
		
		Employee e2=(Employee)e1.clone();
		System.out.println("Employee ID: "+e2.getEid());
        System.out.println("Employee Name: "+e2.getEname());
        System.out.println("Employee UserName: "+e2.getEusername());
        
        System.out.println(e1==e2);
	}

}
