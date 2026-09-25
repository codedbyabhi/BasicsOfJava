package com.nit.arrayPrograms;

import java.util.Scanner;


public class EmployeeManage {
	static Employee[]a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employees : ");
		int size = sc.nextInt();
		a = new Employee[size];
		
		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter Employee Id, Employee Name, Department, Salary : " + (i + 1));
			int employeeId = Integer.parseInt(IO.readln());
			String employeeName = IO.readln();
			String department = IO.readln();
			double salary = Double.parseDouble(IO.readln());
			int publishedYear = Integer.parseInt(IO.readln());

			a[i] = new Employee(employeeId, employeeName, department, salary);
		}
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