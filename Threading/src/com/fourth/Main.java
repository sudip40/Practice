package com.fourth;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		Future<Integer> f1= es.submit(new NewThread(1000));
		Future<Integer> f2= es.submit(new NewThread(2000));
		int sum=f1.get()+f2.get();
		System.out.println("Overall Sum is : "+sum);
		es.shutdown();
	}

}
