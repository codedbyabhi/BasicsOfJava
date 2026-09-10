package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter Student RollNo : ");
		int rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		double marks = sc.nextDouble();
		s.setRollNo(rollNo);
		s.setName(name);
		s.setAge(age);
		s.setMarks(marks);

		System.out.println("Roll No: " + s.getRollNo());
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
		System.out.println("Marks: " + s.getMarks());

	}

}

class Student {

	private int rollNo;
	private String name;
	private int age;
	private double marks;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if (rollNo > 0) {
			this.rollNo = rollNo;
		} else {
			this.rollNo = 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 15 && age<= 60) {
			this.age = age;
		} else {
			this.age = 0;
		}
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		if (marks >= 0 && marks<=100) {
			this.marks = marks;
		} else {
			this.marks = 0;
		}
	}
}
