package com.nit.inheritanePrograms;

import java.util.Scanner;

public class LabTask05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name and Salary : ");
		String name = sc.nextLine();
		double salary = sc.nextDouble();

		Bonus b = new Bonus(name, salary);
		System.out.println("Bonus: " + (int) b.calculateBonus());
	}
}

class Employee4 {
	String name;
	double salary;

	Employee4(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

class Bonus extends Employee4 {

	Bonus(String name, double salary) {
		super(name, salary);

	}

	double calculateBonus() {
		if (salary >= 30000) {
			return salary * 0.10;
		}
		return 0;
	}
}
