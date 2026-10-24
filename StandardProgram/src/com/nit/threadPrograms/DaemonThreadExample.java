package com.nit.threadPrograms;

public class DaemonThreadExample {

	public static void main(String[] args) {

		Thread5 t = new Thread5();
		t.setDaemon(true);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main Thread: " + i);
		}
	}
}
class Thread5 extends Thread {
	public void run() {
		for (int i = 100; i <= 1000; i++) {
			System.out.println("t Thread: " + i);
		}
	}
}