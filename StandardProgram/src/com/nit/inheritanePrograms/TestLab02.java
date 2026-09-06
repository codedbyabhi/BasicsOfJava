package com.nit.inheritanePrograms;

import java.util.Scanner;

public class TestLab02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String brand = sc.nextLine();
		int speed = sc.nextInt();
		sc.nextLine();
		String fuelType = sc.nextLine();
		int seatingCapacity = sc.nextInt();
		Car c = new Car(brand, speed, fuelType, seatingCapacity);
		c.displayCarDetails();
	}
}

class Vehicle {
	String brand;
	int speed;

	Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	void displayVehicleDetails() {
		System.out.println("Vehicle Details:");
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed + " km/h");
	}
}

class Car extends Vehicle {
	String fuelType;
	int seatingCapacity;

	Car(String brand, int speed, String fuelType, int seatingCapacity) {
		super(brand, speed);
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
	}

	void displayCarDetails() {
		super.displayVehicleDetails();
		System.out.println();
		System.out.println("Car Details:");
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Seating Capacity: " + seatingCapacity);
	}

}
