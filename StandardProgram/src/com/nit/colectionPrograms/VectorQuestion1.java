package com.nit.colectionPrograms;

import java.util.Scanner;
import java.util.Vector;

public class VectorQuestion1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Employee> v = new Vector<Employee>();
		System.out.println("Enter number of Employess : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter employeeID employeeName and basic salary of Employee : " + i);
			int employeeId = sc.nextInt();
			sc.nextLine();
			String employeeName = sc.nextLine();
			double basicSalary = sc.nextDouble();

			v.add(new Employee(employeeId, employeeName, basicSalary));

		}
		for (Employee e : v) {
			e.display();
			System.out.println();
		}
	}

}

class Employee {
	public int employeeId;
	public String employeeName;
	public double basicSalary;

	public Employee(int employeeId, String employeeName, double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public double calculateSalary() {

		double finalSalary = basicSalary + (basicSalary * 10 / 100);
		return finalSalary;
	}

	public void display() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Final Salary : " + calculateSalary());
	}

}