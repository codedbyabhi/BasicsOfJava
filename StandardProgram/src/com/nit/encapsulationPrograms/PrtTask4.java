package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtTask4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee3 e = new Employee3();
		System.out.println("Enter Employee ID: ");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String employeeName = sc.nextLine();
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Increase by : ");
		double increaseAmount =sc.nextDouble();
		
		e.setEmployeeId(employeeId);
		e.setEmployeeName(employeeName);
		e.setSalary(salary);
		
		e.increaseSalary(increaseAmount);
		
		System.out.println("Employee ID: "+e.getEmployeeId());
		System.out.println("Employee Name: "+e.getEmployeeName());
		System.out.println("Salary: "+e.getSalary());
	}
}

class Employee3 {
	private int employeeId;
	private String employeeName;
	private double salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
			}
	}
	public void increaseSalary(double percentage) {

		if (percentage >= 0 && percentage <= 100) {

			double increaseAmount = salary * percentage / 100;

			double newSalary = salary + increaseAmount;

			salary = newSalary;
		}
	}
	
}
