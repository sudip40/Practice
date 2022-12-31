package com.second;

public class NewThread implements Runnable {
	int n;

	public NewThread(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
