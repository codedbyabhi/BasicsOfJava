package com.nit.threadPrograms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadLock3 {

	public static void main(String[] args) {

		Lock l = new ReentrantLock();
		MyThread10 t1 = new MyThread10(l);
		MyThread10 t2 = new MyThread10(l);
		t1.start();
		t2.start();

	}

}

class MyThread10 extends Thread {

	public Lock l;

	public MyThread10(Lock l) {
		this.l = l;
	}

	public void run() {

		try {
			if (l.tryLock(7, TimeUnit.SECONDS)) {

				try {
					l.lock();
					System.out.println(Thread.currentThread().getName() + " is Accuired the lock");
					for (int i = 0; i <= 5; i++) {
						System.out.println(Thread.currentThread().getName() + " : " + i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					System.out.println(e);
				} finally {
					l.unlock();
				}
			} else {
				System.out.println(getName() + " : Couldn't aquire lock");
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}