package com.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Future<Integer> ft1 = es.submit(new NewCallable(600));
		Future<Integer> ft2 = es.submit(new NewCallable(2000));
		System.out.println("Sumation of 600 : "+ft1.get());
		System.out.println("Sumation of 2000 : "+ft2.get());
		
		System.out.println("===================================");
		Callable<Integer> call=new NewCallable(800);
		Integer n= call.call();
		System.out.println("Sumation of 800 : "+n);
		es.shutdown();
	}

}
