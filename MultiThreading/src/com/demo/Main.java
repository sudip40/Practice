package com.demo;

public class Main {

	public static void main(String[] args) {
		Company com=new Company();
		Thread p=new Producer(com);
		Thread c=new Consumer(com);
		p.start();
		c.start();
	}

}
