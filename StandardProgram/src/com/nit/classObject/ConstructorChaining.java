package com.nit.classObject;

public class ConstructorChaining {
	public static void main(String[] args) {

		Student2 obj = new Student2("Abhijeet", 101, 22, 90);
		Student2 obj1 = new Student2("Deepak", 102, 23, 89);

		obj.displayDetails();

		System.out.println("==================================\n");
		obj1.displayDetails();
	}
}

class Student2 {

	public String name;
	public int StudentId;
	public int age;
	public double percentage;
	public String city;

	public Student2(String name, int StudentId, int age, double percentage) {
		this.name = name;
		this.StudentId = StudentId;
		this.age = age;
		this.percentage = percentage;

	}

	public Student2(String name, int StudentId, int age, double percentage, String city) {

		this(name, StudentId, age, percentage);
		this.city = city;
	}

	public void displayDetails() {

		System.out.println(name);
		System.out.println(StudentId);
		System.out.println(age);
		System.out.println(percentage + "%");
	}

}
