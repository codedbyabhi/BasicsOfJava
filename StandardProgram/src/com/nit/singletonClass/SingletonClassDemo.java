package com.nit.singletonClass;

public class SingletonClassDemo {
	public static void main(String[] args) {
		Student s1 = Student.giveMeAnObject(10, 20);
		System.out.println(s1);
		Student s2 = Student.giveMeAnObject(30, 40);
		System.out.println(s2);
		Student s3 = Student.giveMeAnObject(50, 60);
		System.out.println(s3);
	}
}

class Student {
	private int i;
	private int j;
	private static Student singletonObject = null;

	public static Student giveMeAnObject(int i, int j) {

		if (singletonObject == null) {
			singletonObject = new Student(i, j);
		}
		return singletonObject;
	}

	private Student(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "Student [i=" + i + ", j=" + j + "]";
	}

	

}