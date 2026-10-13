package com.nit.threadPrograms;

public class InterruptThreadDemo {
	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
	}
}

class MyThread extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			for (int i = 101; i <= 200; i++) {
				System.out.println(i);
			}
		}
		catch (InterruptedException e) {

			System.out.println("Thread t got interrupted");
		}
	}
}