package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(10);
		es.submit(new NewThread(500));
		es.submit(new NewThread(1000));
	}

}
