package com.demo;

public class Company {
	private int n=0;
    private boolean flag=false;
	synchronized public void produce() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
     this.n=n+1;
     System.out.println("Produced : "+n);
     flag=true;
     notify();
	}
	
	synchronized public int consume() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : "+n);
		flag=false;
		notify();
		return n;
	}
}
