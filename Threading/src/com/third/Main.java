package com.third;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.submit(new Sumation(900));
		es.submit(new Sumation(1000));
		es.submit(new Sumation(2000));
		es.shutdown();
	}

}
