package com.nit.inheritanePrograms;

import java.util.Scanner;

public class Qsn07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Student details
		System.out.println("Enter Student name, id, dept and marks:");
		String studentName = sc.nextLine();
		int studentId = sc.nextInt();
		sc.nextLine();
		String studentDepartment = sc.nextLine();
		int studentMarks = sc.nextInt();
		sc.nextLine();

		// Teacher details
		System.out.println("Enter Teacher name, id, dept and salary:");
		String teacherName = sc.nextLine();
		int teacherId = sc.nextInt();
		sc.nextLine();
		String teacherDepartment = sc.nextLine();
		double salary = sc.nextDouble();
		sc.nextLine();

		// Admin details
		System.out.println("Enter Admin name, id, dept and role:");
		String adminName = sc.nextLine();
		int adminId = sc.nextInt();
		sc.nextLine();
		String adminDepartment = sc.nextLine();
		String role = sc.nextLine();

		// Librarian details
		System.out.println("Enter Librarian name, id, dept and books handled:");
		String librarianName = sc.nextLine();
		int librarianId = sc.nextInt();
		sc.nextLine();
		String librarianDepartment = sc.nextLine();
		String booksHandled = sc.nextLine();

		// Student
		Student s = new Student(studentName, studentId, studentDepartment, studentMarks);
		s.displayDetails();
		s.login();
		s.writtenExam();
		s.logout();

		System.out.println();

		// Teacher
		Teacher t = new Teacher(teacherName, teacherId, teacherDepartment, salary);
		t.displayDetails();
		t.login();
		t.teachClass();
		t.logout();

		System.out.println();

		// Admin
		Admin a = new Admin(adminName, adminId, adminDepartment, role);
		a.displayDetails();
		a.login();
		a.manageSystem();
		a.logout();

		System.out.println();

		// Librarian
		Librarian l = new Librarian(librarianName, librarianId, librarianDepartment, booksHandled);

		l.displayDetails();
		l.login();
		l.issueBook();
		l.logout();

		sc.close();
	}
}

class User {

	public String name;
	public int id;
	public String dept;

	public User(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept; // FIXED
	}

	public void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Department : " + dept);
	}

	public void login() {
		System.out.println("User Logged In.");
	}

	public void logout() {
		System.out.println("User Logged Out.");
	}
}

class Student extends User {

	public int marks;

	public Student(String name, int id, String dept, int marks) {
		super(name, id, dept);
		this.marks = marks;
	}

	public void writtenExam() {
		System.out.println("Student is writing exam.");
	}
}

class Teacher extends User {

	public double salary;

	public Teacher(String name, int id, String dept, double salary) {
		super(name, id, dept);
		this.salary = salary;
	}

	public void teachClass() {
		System.out.println("Teacher is teaching the class.");
	}
}

class Admin extends User {

	public String role;

	public Admin(String name, int id, String dept, String role) {
		super(name, id, dept);
		this.role = role;
	}

	public void manageSystem() {
		System.out.println("Admin is managing system.");
	}
}

class Librarian extends User {

	public String bookHandled;

	public Librarian(String name, int id, String dept, String bookHandled) {
		super(name, id, dept);
		this.bookHandled = bookHandled;
	}

	public void issueBook() {
		System.out.println("Librarian is issuing books.");
	}
}