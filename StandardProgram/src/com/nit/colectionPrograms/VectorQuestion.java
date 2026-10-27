package com.nit.colectionPrograms;

import java.util.Scanner;
import java.util.Vector;

public class VectorQuestion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector<Student> v = new Vector<Student>();
		System.out.println("Enter number of students : ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter rollNumber name and marks of a student : " + i);
			int rollNumber = sc.nextInt();
			sc.nextLine();
			String studentName = sc.nextLine();
			double marks = sc.nextDouble();
			v.add(new Student(rollNumber, studentName, marks));
		}
		for (Student e : v) {
			e.display();
			System.out.println();
		}

	}
}

class Student {
	public int rollNumber;
	public String studentName;
	public double marks;

	public Student(int rollNumber, String studentName, double marks) {

		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}

	public void display() {

		System.out.println("Roll number : " + rollNumber);
		System.out.println("Name : " + studentName);
		System.out.println("Marks : " + marks);
	}

}
