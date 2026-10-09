package com.nit.exceptionPrograms;

import java.util.Scanner;

public class PayrollSystemCalculateGrossSalaryAndTax {
	
	static void calculateGross() throws SalaryCalculationException {
		calculateTax();
	}
	static void calculateTax() throws SalaryCalculationException {
		generatePayslip();
	}
	static void generatePayslip() throws SalaryCalculationException {
		throw new SalaryCalculationException("Error: Invalid salary data");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextInt();
		double bonus = sc.nextInt();
		
		try {
			calculateGross();
		}
		catch(SalaryCalculationException s) {
			System.out.println(s.getMessage());
		}
	}
}
class SalaryCalculationException extends Exception{

	public SalaryCalculationException(String errorMessage) {
		super(errorMessage);
	}
}
