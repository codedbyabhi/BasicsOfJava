package com.nit.inheritanePrograms;

import java.util.Scanner;

public class Qsn05 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Vehical Number : ");
	String vehicleNumber = sc.nextLine();
	System.out.println("Enter Fuel type : ");
	String fuelType = sc.nextLine();
	System.out.println("Enter Rent per day : ");
	int rentPerDay = sc.nextInt();
	System.out.println("Enter Luxury Charges : ");
	int luxuryCharge = sc.nextInt();
	System.out.println("Enter How many Days : ");
	int days = sc.nextInt();
	
	LuxuryCar lc = new LuxuryCar(vehicleNumber, fuelType, rentPerDay, luxuryCharge);
	lc.displayDetails();
	System.out.println("Final Rent per day : "+lc.calculateFinalRent(days));
	}
}
class Vehicle{
	
	public String vehicleNumber;
	public String fuelType;
	public Vehicle(String vehicleNumber, String fuleType) {
		
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuleType;
	}
	public void displayDetails() {
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Fuel Type : "+fuelType);
	}
}
class Car extends Vehicle{
	public int rentPerDay;

	public Car(String vehicleNumber, String fuleType, int rentPerDay) {
		super(vehicleNumber, fuleType);
		this.rentPerDay = rentPerDay;
	}
	public int calculateRent(int days) {
		
		int totalRent = rentPerDay*days;
		System.out.println("Total Rent : "+totalRent);
		return totalRent;
	}
}
class LuxuryCar extends Car{
	
	public int luxuryCharge;

	public LuxuryCar(String vehicleNumber, String fuleType, int rentPerDay, int luxuryCharge) {
		super(vehicleNumber, fuleType, rentPerDay);
		this.luxuryCharge = luxuryCharge;
		
	}
	public int calculateFinalRent(int days) {
		
		System.out.println("Luxury Charges are : "+luxuryCharge);
		int finalRent = super.calculateRent(days) + luxuryCharge;
		
		return finalRent;
		
	}
}
