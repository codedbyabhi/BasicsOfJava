package com.nit.threadPrograms;

public class SynchronizationDemo {
	public static void main(String[] args) {
		Whatsapp w = new Whatsapp();
		MyThread02 mt1 = new MyThread02(w, "Ramesh");
		MyThread02 mt2 = new MyThread02(w, "Sharmila");
		mt1.start();
		mt2.start();
	}
}

class MyThread02 extends Thread {
	public Whatsapp wa;
	public String name;

	public MyThread02(Whatsapp wa, String name) {
		this.wa = wa;
		this.name = name;
	}
	
	public void run() {
		wa.sendMessage(name);
	}
}

class Whatsapp {
	public synchronized void sendMessage(String name) {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name + "-> Good Meowning...");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

			System.out.println(e);
		}
	}
}
