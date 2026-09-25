package com.nit.arrayPrograms;

import java.util.Scanner;

public class EmployeeManage {
	static Employee[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employees : ");
		int size = sc.nextInt();
		a = new Employee[size];
		sc.nextLine();
		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter Employee Id, Employee Name, Department, Salary : " + (i + 1));
			int employeeId = sc.nextInt();
			sc.nextLine();
			String employeeName = sc.nextLine();
			String department = sc.nextLine();
			double salary = sc.nextDouble();

			a[i] = new Employee(employeeId, employeeName, department, salary);
			sc.nextLine();
		}
		System.out.println("======================================");
		System.out.println("Enter 1 for printing Employees belong to the Given Department.");
		System.out.println("Enter 2 for printing Employees who are having salary greater than given Salary.");
		System.out.println("Enter 3 for Average Salary.");
		System.out.println("======================================");
		
		System.out.println("Enter your Choice : ");
		int choice = sc.nextInt();
		switch(choice) {
			
			case 1 ->{
				sc.nextLine();
				System.out.println("Enter the Department name :");
				String department = sc.nextLine();
				empBelongToGivenDept(department);
			}
			case 2 ->{
				System.out.println("Enter target Salary : ");
				double salary = sc.nextDouble();
				empGreaterThanGivenSalary(salary);
			}
			case 3 ->{
				avgSalary();
				
			}
			default ->{
				System.out.println("Enter valid input!");
				
			}
		}
	}

	public static void empBelongToGivenDept(String department) {
		for (Employee e : a) {
			if (e.department.equalsIgnoreCase(department)) {
				System.out.println("==============================");
				e.displayDetails();
			}
		}
	}

	public static void empGreaterThanGivenSalary(double salary) {
		for (Employee e : a) {
			if (e.salary > salary) {
				System.out.println("==============================");
				e.displayDetails();
			}
		}
	}

	public static void avgSalary() {
		double sum = 0;
		for (Employee e : a) {
			sum += e.salary;
		}
		System.out.println("Average salary = " + (sum / a.length));
	}
}

class Employee {
	public int employeeId;
	public String employeeName;
	public String department;
	public double salary;

	public Employee(int employeeId, String employeeName, String department, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Department : " + department);
		System.out.println("Employee Salary : " + salary);
	}

}