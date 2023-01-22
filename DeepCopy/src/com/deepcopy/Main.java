package com.deepcopy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add=new Address("West Bengal","Kolkata","700129");
		Employee e1=new Employee(1,"Sudip","Sudip40",add);
		System.out.println(e1);
		System.out.println("This is the example of deep copy");
	}

}
