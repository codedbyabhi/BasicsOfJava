package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtQsn04 {
	
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int employeeNumber = sc.nextInt();
	        sc.nextLine();

	        String employeeName = sc.nextLine();
	        double employeeSalary = sc.nextDouble();
	        double increment = sc.nextDouble();

	        Employee obj = new Employee(employeeNumber, employeeName, employeeSalary);
	        double currentSalary = obj.getEmployeeSalary();
	        double updatedSalary = currentSalary + increment;
	        obj.setEmployeeSalary(updatedSalary);
	        String designation = obj.getEmployeeDesignation(obj.getEmployeeSalary());
	        System.out.println("Employee Number : " + obj.getEmployeeNumber());
	        System.out.println("Employee Name : " + obj.getEmployeeName());
	        System.out.println("Employee Salary : " + obj.getEmployeeSalary());
	        System.out.println("Employee Designation : " + designation);
	    }
	}

	class Employee {
	    private int employeeNumber;
	    private String employeeName;
	    private double employeeSalary;
	    public Employee(int employeeNumber, String employeeName, double employeeSalary) {
	        this.employeeNumber = employeeNumber;
	        this.employeeName = employeeName;
	        this.employeeSalary = employeeSalary;
	    }
	    public int getEmployeeNumber() {
	        return employeeNumber;
	    }
	    public void setEmployeeNumber(int employeeNumber) {
	        this.employeeNumber = employeeNumber;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    public double getEmployeeSalary() {
	        return employeeSalary;
	    }
	    public void setEmployeeSalary(double employeeSalary) {
	        this.employeeSalary = employeeSalary;
	    }
	    public String getEmployeeDesignation(double salary) {
	        if (salary >= 120000)
	         {
	            return "HR Manager";
	        } 
	        else if (salary >= 90000)
	         {
	            return "Developer";
	        } 
	        else if (salary >= 60000)
	         {
	            return "Designer";
	        } 
	        else
	         {
	            return "Tester";
	        }
	    }
	}