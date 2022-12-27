package com.demo;

public class Consumer extends Thread {

	private Company com;

	public Consumer(Company com) {
		this.com=com;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			com.consume();
		}
	}

}
