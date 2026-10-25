package com.nit.threadPrograms;

public class Non_DaemonThreadExample {
	
	public static void main(String[] args) {

		Thread4 t = new Thread4();
		t.start();
		t.setName("Mohpatro");
		for (int i = 1; i <= 10; i++) {
			System.out.println("main Thread: " + i);
		}
	}
}
class Thread4 extends Thread {
	public void run() {
		for (int i = 100; i <= 1000; i++) {
			System.out.println("t Thread: " + i);
		}
	}
}