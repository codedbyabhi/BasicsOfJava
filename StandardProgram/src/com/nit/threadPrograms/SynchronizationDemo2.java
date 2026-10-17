package com.nit.threadPrograms;

public class SynchronizationDemo2 {

	public static void main(String[] args) {
		Employee4 e1 = new Employee4();
		ThreadA t1 = new ThreadA(e1);
		ThreadB t2 = new ThreadB(e1);
		t1.start();
		t2.start();
	}

}

class ThreadA extends Thread {
	public Employee4 emp;

	public ThreadA(Employee4 emp) {
		this.emp = emp;
	}

	public void run() {
		emp.demo();
	}

}

class ThreadB extends Thread {
	public Employee4 emp;

	public ThreadB(Employee4 emp) {
		this.emp = emp;
	}

	public void run() {
		emp.demo();
	}

}

class Employee4 {
	public  static synchronized void demo() { // Synchronized Method
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(1000);
			}
			synchronized (Employee1.class) {
				for (int i = 6; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					Thread.sleep(1000);
				}

			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
