package com.nit.inheritanePrograms;

public class Qsn04 {

}

class Person {

	public String name;
	public int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void displayDetails() {

	}

}

class Employee1 extends Person {
	public double salary;

	
	public void displayDeatails() {
		super.displayDetails();
		
	}

}