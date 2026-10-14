package com.nit.threadPrograms;

public class StudentDetailsUsingTwoThreads {
	public static void main(String[] args) {
		Student s = new Student(101,"Abhi","Java");
		StudentDetailsThread t1 = new StudentDetailsThread(s);
		CourseDetailsThread t2 = new CourseDetailsThread(s);
		t1.start();
		t2.start();

	}
}

class Student {
	public int id;
	public String name;
	public String course;

	public Student(int id, String name, String course) {

		this.id = id;
		this.name = name;
		this.course = course;
	}
	
}
class StudentDetailsThread extends Thread{
	public Student s;
	
	public StudentDetailsThread(Student s) {
		this.s=s;
	}
	public void run() {
		System.out.println("Student Id : "+s.id);
		System.out.println("Student Name : "+s.name);
	}
	
}
class CourseDetailsThread extends Thread{
	public Student s;
	
	public CourseDetailsThread(Student s) {
		this.s=s;
	}
	public void run() {
		System.out.println("Course Name : "+s.course);
	}
	
}
