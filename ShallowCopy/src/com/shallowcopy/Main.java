package com.shallowcopy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add=new Address("West Bengal","Kolkata","700129");
		Employee e1=new Employee(1,"Sudip","Sudip40",add);
		System.out.println(e1);
		add.setCity("Burdwan");
		System.out.println(e1+" this is the problem with shallow copy");
	}

}
