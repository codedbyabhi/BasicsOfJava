package com.nit.threadPrograms;

public class NotifyDemo{
	public static void main(String[] args) throws InterruptedException{
		MyThread3 t = new MyThread3();
		t.start();
		System.out.println("Main thread waits for t thread");
		synchronized (t) {
			t.wait();
		}
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

	}
}Object 
class MyThread3 extends Thread {

	public void run() {
		for (int i = 101; i <= 200; i++) {
			System.out.println(i);
			if (i == 150) {
				synchronized (this) {
					System.out.println("T thread notifies the waiting thread(main thread)");
					notify();
				}
			}
		}
	}
}
