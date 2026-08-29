package com.nit.hasArelationshipProgram;

public class AssociationDemo {
	public static void main(String[] args) {

		Pen p = new Pen("cello", "Black", "Ball", 15.0);
		Student s = new Student("Abhi", 22, 101, p);
		s.display();
	}
}

class Student {
	String name;
	int age;
	int rollNumber;
	Pen pen;

	public Student(String name, int age, int rollNumber, Pen pen) {

		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.pen = pen;
	}

	public void display() {
		System.out.println("Student name : "+name);
		System.out.println("Student age : "+age);
		System.out.println("Student Roll No : "+rollNumber);
		System.out.println("Pen deatails : ");
		pen.display();
	}
}

class Pen {
	String brand;
	String colour;
	String type;
	double price;

	public Pen(String brand, String colour, String type, double price) {

		this.brand = brand;
		this.colour = colour;
		this.type = type;
		this.price = price;
	}

	public void display() {

		System.out.println("Pen Brand : "+brand);
		System.out.println("Pen colour : "+colour);
		System.out.println("Pen type : "+type);
		System.out.println("Price : "+price);
	}
}