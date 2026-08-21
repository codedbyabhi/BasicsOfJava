package com.nit.classObject;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter basicSalary :");
		double salary = sc.nextDouble();
		
		Employee ee = new Employee(name, salary);
		ee.display();
	}

}

class Employee {
	public String name;
	public double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public double hra() {

		double p = (salary * 10) / 100;
		return p;
	}

	public double da() {

		double a = (salary * 20) / 100;

		return a;
	}

	public double calculateTotal() {

		return hra() + da() + salary;
	}
	public void display() {
		
		System.out.println(name);
		System.out.println(hra());
		System.out.println(da());
		System.out.println(calculateTotal());
		
	}
}
