package com.nit.inheritanePrograms;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name, age, salary, bonus : ");
		String name = sc.nextLine();
		
		int age = sc.nextInt();
		double salary = sc.nextDouble();
		double bonus = sc.nextDouble();
		
		Manager m = new Manager(name, age, salary, bonus);
		
		m.displayDetails();
	}
}
class Person {

	public String name;
	public int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
//		
//		System.out.println(name);
//		System.out.println(age);
		return ;
		
	}

}

class Employee1 extends Person {

	public double salary;

	public Employee1(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public void  displayDetails() {
		
		super.displayDetails();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		
		return ;
	}
}
class Manager extends Employee1{
	
	public double bonus;

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}
	public void  displayDetails() {
		super.displayDetails();
		double totalSalary = salary + bonus;
		System.out.println("Bonus : "+bonus);
		System.out.println("Total salary :"+totalSalary);
		return ;
	}
}