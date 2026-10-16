package com.nit.threadPrograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);

	}
}

class Task implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executeint...!!!");
	}

}