package com.nit.arrayPrograms;

import java.util.Scanner;

public class EmployeeManage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employees : ");
		
	}
}
class Employee{
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
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Department : "+department);
		System.out.println("Employee Salary : "+salary);
	}
		
}