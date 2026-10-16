package com.nit.threadPrograms;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadLock {

	public static void main(String[] args) {
		Lock l = new ReentrantLock();
		MyThread6 t1 = new MyThread6(l);
		MyThread7 t2 = new MyThread7(l);

		t1.start();
		t2.start();
	}
}

class MyThread6 extends Thread {

	public Lock l;

	public MyThread6(Lock l) {

		this.l = l;
	}

	public void run() {
		try {
			l.lock();
			System.out.println(Thread.currentThread().getName() + " : is acquired the lock");
			for (int i = 1; i <= 5; i++) {
				System.out.println(getName() + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		} finally {
			l.unlock();
		}
	}

}

class MyThread7 extends Thread {

	public Lock l;

	public MyThread7(Lock l) {

		this.l = l;
	}

	public void run() {
		
		if(l.tryLock()) {
		try {
			l.tryLock();
			System.out.println(Thread.currentThread().getName() + " : is acquired the lock");
			for (int i = 1; i <= 5; i++) {
				System.out.println(getName() + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		} finally {
			l.unlock();
			System.out.println(getName()+" :  is released the lock");
		}}
		else {
			System.out.println(getName()+" : Couldn't aquire lock");
		}
	}

}
