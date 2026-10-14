package com.nit.stringProgram;

public class CheckAnagramString {
	public static void main(String[] args) throws InterruptedException {
		Employee emp = new Employee();
		ThreadX x = new ThreadX(emp);
		ThreadY y = new ThreadY(emp);
		x.start();
		y.start();
	}
}

class Employee {
	public synchronized void demo() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(0);

			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public synchronized void fast() {
		try {
			for (int i = 101; i <= 105; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(0);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class ThreadX extends Thread {
	public Employee emp;

	public ThreadX(Employee emp) {
		this.emp = emp;

	}

	public void run() {
		emp.demo();
	}
}

class ThreadY extends Thread {
	public Employee emp;

	public ThreadY(Employee emp) {
		this.emp = emp;

	}

	public void run() {
		emp.fast();
	}
}