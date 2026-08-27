package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class Qsn02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int empId = sc.nextInt();
		sc.nextLine();
		String empName = sc.nextLine();
		double salary = sc.nextDouble();
		double newSalary = sc.nextDouble();

		HrDepartment hr = new HrDepartment(empId, empName, salary);
		hr.setSalary(newSalary);
		System.out.println("Salary : " + hr.getSalary());

	}
}

class Employee {
	private int empId;
	private String empName;
	private double salary;

	public Employee(int empId, String empName, double salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {

		if (newSalary < 0) {

			System.out.println("Invalid salary");
		} else {

			this.salary = newSalary;
			System.out.println("Salary Updated Successfully..");
		}
	}

	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Salary : " + salary);
	}
}

class HrDepartment extends Employee {

	public HrDepartment(int empId, String empName, double salary) {
		super(empId, empName, salary);
	}

	public void setSalary(double newSalary) {

		if (newSalary > 1.5 * getSalary()) {

			System.out.println("Increment Limit Exceeded");

		} 
		else {

			super.setSalary(newSalary);
		
		
		}

	}

}
