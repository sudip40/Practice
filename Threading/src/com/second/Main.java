package com.second;

public class Main {

	public static void main(String[] args) {
		NewThread nt=new NewThread(800);
		Thread t= new Thread(nt);
		t.start();
	}

}
