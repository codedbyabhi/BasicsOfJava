package com.nit.classObject;

import java.util.Scanner;

public class Qsn03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.print("Enter marks 1 : ");
		int marks1 = sc.nextInt();
		System.out.print("Enter marks 2 : ");
		int marks2 = sc.nextInt();
		System.out.print("Enter marks 3 : ");
		int marks3 = sc.nextInt();
		
		Student3 obj = new Student3(name,marks1,marks2,marks3);
		
		obj.displayDetails();

	}
}

class Student3 {

	public String name;
	public int marks1;
	public int marks2;
	public int marks3;

	public Student3(String name, int marks1, int marks2, int marks3) {

		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int calculateTotal() {
		
		return marks1 + marks2 + marks3;

	}
	public double calculateAvrage() {
		
		return calculateTotal()/3.0;
	}
	
	public void displayDetails() {
		System.out.println("\n");
		System.out.println(name);
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(marks3);
		System.out.println(calculateTotal());
		System.out.println(calculateAvrage());
	}
}
