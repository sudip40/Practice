package com.project;

public class Producer implements Runnable {
	private Company c;
	public Producer(Company c) {
	 this.c=c;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(2000);
				c.produce();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
