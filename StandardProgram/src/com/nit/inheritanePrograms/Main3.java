package com.nit.inheritanePrograms;

abstract class Employeee {

	Employeee() {
		System.out.println("Employee constructor called");
	}

	abstract void work();

	static void companyPolicy() {
		System.out.println("All employees must follow company policies");
	}
}

class Developer extends Employeee {

	void work() {
		System.out.println("Developer is coding");
	}
}

public class Main3 {
	public static void main(String[] args) {

		Developer d = new Developer();

		d.work();

		Employeee.companyPolicy();
	}
}
