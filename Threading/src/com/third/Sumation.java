package com.third;

public class Sumation implements Runnable{
int n;
public Sumation(int n) {
	this.n=n;
}
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum=sum+i;
			System.out.println(sum);
		}
	}
}
