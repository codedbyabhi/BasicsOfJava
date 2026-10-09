package com.nit.threadPrograms;

public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread();
		t1.start();
		Thread t2 = new Thread();
		t2.start();

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

	}
}

class MyThread1 extends Thread {

	public void run() {
		for (int i = 101; i <= 200; i++) {
			System.out.println(i);

		}
	}
}

class MyThread2 extends Thread {

	public void run() {
		for (int i = 201; i <= 300; i++) {
			System.out.println(i);

		}
	}
}