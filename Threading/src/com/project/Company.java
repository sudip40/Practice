package com.project;

public class Company {
	private static int n = 0;
	private boolean flag = false;

	synchronized public void produce() throws InterruptedException {
		if (flag) {
			wait();
		}
		n++;
		System.out.println("After Production Value of N : " + n);
		flag = true;
		notify();
	}

	synchronized public void consume() throws InterruptedException {
		if (!flag) {
			wait();
		}
		System.out.println("After Consumption Value of N : " + n);
		flag = false;
		notify();
	}

}
