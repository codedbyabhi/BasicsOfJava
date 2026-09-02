package com.nit.abstractionPRogram;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter salary :");
		double salary = sc.nextDouble();
		
		Employee emp = FactoryClass.getImplementationObject(choice);
		System.out.println("Bonus : "+emp.calculateBonus(salary));
		
	}

}
abstract class Employee{
	public abstract double calculateBonus(double salary);
}
class FactoryClass{
	public static Employee getImplementationObject(int choice) {
		Employee emp = null;
		switch(choice) {
		case 1 -> emp = new PermenantEmployee();
		case 2 -> emp = new ContractEmployee();
		
		}
		return emp;
	}
}
class PermenantEmployee extends Employee{
	public double calculateBonus(double salary) {
	return salary*0.1;
	}
}
class ContractEmployee extends Employee{
	public double calculateBonus(double salary) {
	return salary*0.05;
	}
}
