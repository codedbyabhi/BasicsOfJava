package com.nit.threadPrograms;

public class DisplayNumberByUsingTwoThreads {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.setName("Thread One");

		Thread2 t1 = new Thread2();
		t1.setName("Thread two");
		t.start();
		t1.start();

	}
}

class Thread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}

	class Thread2 extends Thread {
		public void run() {
			for (int i = 6; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}

		}
	}