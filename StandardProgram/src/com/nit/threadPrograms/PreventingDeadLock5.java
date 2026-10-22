package com.nit.threadPrograms;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadLock5 {
	public static void main(String[] args) {

		Lock l = new ReentrantLock();
		MyThread11 t1 = new MyThread11(l);
		MyThread11 t2 = new MyThread11(l);
		t1.start();
		t2.start();
		
		try {
			System.out.println("Main waits for 5 seconds");
			Thread.sleep(5000);
			Thread.State t1State = t1.getState();
			if(t1State==Thread.State.WAITING)t1.interrupt();
			else t2.interrupt();
		}

		catch(InterruptedException e) {
			System.out.println("After 5 sec main interrupted the waiting t2 thread.");
		}
	}
}

class MyThread11 extends Thread {

	public Lock l;

	public MyThread11(Lock l) {
		super();
		this.l = l;
	}

	public void run() {
		try {
			l.lockInterruptibly();
			System.out.println(getName() + " is acquired the lock");
			for (int i = 1; i <= 10; i++) {
				System.out.println(getName() + " : " + i);
			}

			System.out.println(getName() + " is relesed the lock");
			l.unlock();
		} 
		catch (InterruptedException e) {
			System.out.println(getName() + " is interrupted...!");

		}

	}
}
