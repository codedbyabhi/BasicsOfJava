// This program show the output of two thread 1 is synchronized and another one is non-synchronized.   
// Here sir told u to make both methods synchronized to see the output, the output of making both method synchronized is first one thread executed then another one by one.
// So if we make one method synchronized and another non-synchronized it will run same time like synchronized not working for this bcz 1 method is Synchro and another is Non-Synchro
package com.nit.threadPrograms;

public class LevelsOfLock {
	public static void main(String[] args) {
		Employee e = new Employee();
		ThreadX t1 = new ThreadX(e);
		ThreadY t2 = new ThreadY(e);
		t1.start();t2.start();
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

class Employee {
	public synchronized void demo() { // Synchronized Method
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + "" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public void fast() { //Non-Synchronized method

		try {
			for (int i = 11; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + "" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
