package com.nit.threadPrograms;

public class LevelsOfLock2 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		ThreadXY t1 = new ThreadXY(e1);
		ThreadYX t2 = new ThreadYX(e2);
		t1.start();
		t2.start();
	}

}

class ThreadXY extends Thread {
	public Employee1 emp;

	public ThreadXY(Employee1 emp) {
		this.emp = emp;
	}

	public void run() {
		emp.demo();
	}

}

class ThreadYX extends Thread {
	public Employee2 emp;

	public ThreadYX(Employee2 emp) {
		this.emp = emp;
	}

	public void run() {
		emp.demo();
	}

}

class Employee1 {
	public synchronized void demo() { // Synchronized Method
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

class Employee2 {
	public synchronized void demo() { // Synchronized Method

		for (int i = 6; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);

		}

	}

}
