// .join Method.
//Deadlock join Example.
package com.nit.threadPrograms;

public class ThreadDemo4 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable4 r1 = new MyRunnable4(Thread.currentThread());
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("Main thread waits for t1 thread to get terminated.");
		t1.join();
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Main Thread is Termineted.");
	}
}

class MyRunnable4 implements Runnable {

	Thread mt;

	public MyRunnable4(Thread mt) {
		this.mt = mt;
	}

	public void run() {
		System.out.println("t1 wait for main thread got Termineted");
		try {
			mt.join();
			for (int i = 101; i <= 200; i++) {
				System.out.println(i);
			}
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t1 is Termineted");
	}
}
