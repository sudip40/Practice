package com.project;

public class Main {

	public static void main(String[] args) {
		Company com=new Company();
		Thread p=new Thread(new Producer(com));
		Thread c=new Thread(new Consumer(com));
		p.start();
		c.start();
	}

}
