package com.nit.polymorphismProgram;

public class Qsn01 {
public static void main(String[] args) {
	
	SalaryCalculator sc = new SalaryCalculator();
	System.out.println(sc.calculateSalary(5000.0));
	System.out.println(sc.calculateSalary(20,500.0));
	System.out.println(sc.calculateSalary(30000.0,5000.0));
 	}
}
class SalaryCalculator{
	
	public double calculateSalary(double monthlySalary) {
		return monthlySalary;
	}
	public double calculateSalary(int hours, double ratePerHour) {
		return hours*ratePerHour;
	}
	public double calculateSalary(double fixedAmount, double bonus) {
		return fixedAmount+bonus;
	}
	
}
