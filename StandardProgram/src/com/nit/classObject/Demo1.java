package com.nit.classObject;

public class Demo1 {
	public static void main(String[] args) {

		Car c1 = new Car();

		c1.company = "Toyota";
		c1.color = "Red";
		c1.milage = 18.5;
		c1.displayDetails();
		System.out.println("\n");	
		
		Car c2 = new Car();

		c2.company = "BMW";
		c2.color = "Black";
		c2.milage = 15.2;
		c2.displayDetails();
		System.out.println("\n");
		
		Car c3 = new Car();

		c3.company = "Honda";
		c3.color = "Blue";
		c3.milage = 12;
		c3.displayDetails();
		System.out.println("\n");
		
		Car c4 = new Car();

		c4.company = "Audi";
		c4.color = "Gary";
		c4.milage = 14.7;
		c4.displayDetails();
		System.out.println("\n");
		
		Car c5 = new Car();

		c5.company = "Suzuki";
		c5.color = "Crome";
		c5.milage = 19;
		c5.displayDetails();
		System.out.println("\n");

	}

}

class Car {

	public String company;
	public String color;
	public double milage;

	public void displayDetails() {

		System.out.println("Company : " + company);
		System.out.println("Color : " + color);
		System.out.println("Milage : " + milage + " Kmpl");
	}

}