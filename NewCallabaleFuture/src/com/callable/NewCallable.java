package com.callable;

import java.util.concurrent.Callable;

public class NewCallable implements Callable<Integer> {
	int n;

	public NewCallable(int n) {
		this.n=n;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i;
		}

		return sum;
	}

}
