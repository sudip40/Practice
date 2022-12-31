package com.lamda;

public class Main {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("My name is Sudip");
		Thread t = new Thread(r);
		t.start();
		System.out.println("===============================================");
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Int I : " + i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
