package com.nit.threadPrograms;

public class InterruptThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		Mythread3 t = new Mythread3();
		t.start();
		Thread.sleep(5000);
		System.out.println("Main thread waits for t thread");
		synchronized (t) {
			t.wait();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

class Mythread3 extends Thread {

	public void run() {
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
			if (i == 15) {
				synchronized (this) {
					System.out.println("t thread notifies the waiting thread(Main thread)");
					notify();

				}
			}
		}
	}

}
