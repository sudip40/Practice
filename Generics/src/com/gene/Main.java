package com.gene;

public class Main {

	public static void main(String[] args) {
	 Gene<String> str=new Gene<String>("Sudip");
	 str.work();
	 System.out.println("======================================");
	 Gene<Integer> i=new Gene<Integer>(5000);
	 i.work();
	 System.out.println("======================================");
	 Gene<String> e=new Gene<String>("80000");
	 e.work();
	 System.out.println("======================================");
	 Gene<Character> c=new Gene<Character>('C');
	 c.work();
	}

}
