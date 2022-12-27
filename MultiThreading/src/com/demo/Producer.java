package com.demo;

public class Producer extends Thread {

	private Company com;

	public Producer(Company com) {
		this.com = com;
	}

	@Override
	public void run() {
		while (true) {
			this.com.produce();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
