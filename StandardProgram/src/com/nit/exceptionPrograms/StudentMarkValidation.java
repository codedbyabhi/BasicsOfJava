package com.nit.exceptionPrograms;

import java.util.Scanner;

public class StudentMarkValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String studentName = sc.nextLine();
		int[] marks = new int[5];

		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		Student s = new Student(studentName, marks);

		try {
			double average = s.calculateAverage();
			System.out.println("Student Name: " + studentName);
			System.out.printf("Average Marks: %.2f%n", average);
		} catch (InvalidMarksException e) {
			System.out.println(e.getMessage());
		}

	}
}

class InvalidMarksException extends Exception {

	public InvalidMarksException(String errorMessage) {
		super(errorMessage);
	}
}

class Student {
	private String studentName;
	private int[] marks;

	public Student(String studentName, int[] marks) {

		this.studentName = studentName;
		this.marks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double calculateAverage() throws InvalidMarksException {
		int sum = 0;

		for (int mark : marks) {

			if (mark < 0 || mark > 100) {
				throw new InvalidMarksException("Invalid marks found");
			}
			sum += mark;
		}
		return sum / 5.0;
	}
}