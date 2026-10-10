// .join Method.
package com.nit.threadPrograms;

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable3 r1 = new MyRunnable3(Thread.currentThread());
		Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Main Thread is Termineted.");
	}
}

class MyRunnable3 implements Runnable {

	Thread mt;

	public MyRunnable3(Thread mt) {
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
