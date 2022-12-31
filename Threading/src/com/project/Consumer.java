package com.project;

public class Consumer implements Runnable {
	private Company c;

	public Consumer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				c.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
