package com.first;

public class Main {

	public static void main(String[] args) {
		Thread t=new NewThread(600);
		t.start();
	}

}
