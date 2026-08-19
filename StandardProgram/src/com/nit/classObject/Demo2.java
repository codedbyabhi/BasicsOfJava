package com.nit.classObject;

public class Demo2 {

	public static void main(String[] args) {

		Car1 c1 = new Car1();
		
		c1.initialization("Honda", "Black", 18.0);
		c1.displayDetails();
	}

}

class Car1 {

	public String company;
	public String color;
	public double milage;
	
	public void initialization(String comp, String clr, double mil) {
		
		company = comp;
		color = clr;
		milage = mil;
		
	}

	public void displayDetails() {

		System.out.println("Company : " + company);
		System.out.println("Color : " + color);
		System.out.println("Milage : " + milage + " Kmpl");
	}

}