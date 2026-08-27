package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		int studentId = sc.nextInt();
		sc.nextLine();
		String studentName = sc.nextLine();
		int marks = sc.nextInt();
		int newMarks = sc.nextInt();
		
		ExamPortal ex = new ExamPortal(studentId, studentName, marks);
		ex.setMarks(newMarks);
		System.out.println("Marks : "+ex.getMarks());
		
	}
}

class StudentAccount {
	private int studentId;
	private String studentName;
	private int marks;

	public StudentAccount(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int newMarks) {
		if (newMarks >= 0 && newMarks <= 100) {
			this.marks = newMarks;
			System.out.println("Marks updated successfully.");
		} else {
			System.out.println("Invalid Marks");
		}
	}

	public void displayResult() {

		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Marks : " + marks);
	}
}

class ExamPortal extends StudentAccount {

	public ExamPortal(int studentId, String studentName, int marks) {
		super(studentId, studentName, marks);
	}

	public void setMarks(int newMarks) {
		if (newMarks > 100) {
			System.out.println("Marks cannot Exceed 100.");
		} else {
			super.setMarks(newMarks);
		}

	}

}
