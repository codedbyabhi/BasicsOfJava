package com.nit.classObject;

public class Demo2 {

	public static void main(String[] args) {

		Car1 c1 = new Car1();

		c1.initialization("Honda", "Red", 18.0);
		c1.displayDetails();
		System.out.println("\n");

		Car1 c2 = new Car1();

		c2.initialization("Toyota", "Silver", 15.8);
		c2.displayDetails();
		System.out.println("\n");

		Car1 c3 = new Car1();

		c3.initialization("BMW", "Black", 17.4);
		c3.displayDetails();
		System.out.println("\n");

	}

}

class Car1 {

	public String company;
	public String color;
	public double milage;

	public void initialization(String company, String color, double milage) {

		this.company = company;
		this.color = color;
		this.milage = milage;
		// use this. when variable and method have same name like this company and
		// company.
	}

	public void displayDetails() {

		System.out.println("Company : " + company);
		System.out.println("Color : " + color);
		System.out.println("Milage : " + milage + " Kmpl");
	}

}