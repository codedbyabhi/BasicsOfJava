package com.nit.inheritanePrograms;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, id, salary and bonus :");
		String name = sc.nextLine();
		int id = sc.nextInt();
		double salary = sc.nextDouble();
		double bonus = sc.nextDouble();

		BonusEmployee be = new BonusEmployee(name, id, salary, bonus);

		be.display();
		be.calculateSalary();
	}

}

class Employee {

	public String name;
	public int id;
	public double salary;

	public Employee(String name, int id, double salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void display() {

		System.out.println("Name :" + name);
		System.out.println("Id :" + id);
		System.out.println("Final Salary :" + calculateSalary());
	}

	public double calculateSalary() {

		return salary;
	}
}

class BonusEmployee extends Employee {

	public double bonus;

	public BonusEmployee(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public void display() {

		super.display();
		//System.out.println("Bonus : " + bonus);
	}

	public double calculateSalary() {

	System.out.println("Basic Salary : " + super.calculateSalary());
		System.out.println("Bonus : " + bonus);
		return super.calculateSalary() + bonus;
	}
}
