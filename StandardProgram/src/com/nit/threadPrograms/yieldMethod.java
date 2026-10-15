package com.nit.threadPrograms;

public class yieldMethod {
	public static void main(String[] args) throws InterruptedException {
		MyThread4 t1 = new MyThread4();
		MyThread5 t2 = new MyThread5();

		t1.setName("Thread-1");
		t2.setName("Thread-2");

		t1.start();
		t1.sleep(2000);
		t2.start();
		System.out.println(t1.getName());
		
	}
}

class MyThread4 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);

			if (i == 2) {
				Thread.yield();
			}
		}
	}
}
class MyThread5 extends Thread {
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
