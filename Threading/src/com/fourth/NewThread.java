package com.fourth;

import java.util.concurrent.Callable;

public class NewThread implements Callable<Integer> {
	int n;

	public NewThread(int n) {
		this.n = n;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			Thread.sleep(200);
			sum = sum + i;
			System.out.println(sum);
		}
		return sum;
	}

}
