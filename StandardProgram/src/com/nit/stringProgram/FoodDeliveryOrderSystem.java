package com.nit.stringProgram;

import java.util.Scanner;

public class FoodDeliveryOrderSystem {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String restaurantName = sc.nextLine();
		String city = sc.nextLine();
		String orderId = sc.nextLine();
		double foodAmount = sc.nextDouble();
		double deliveryFee = sc.nextDouble();

		DeliveryOrder order = new DeliveryOrder(restaurantName, city, orderId, foodAmount, deliveryFee);

		System.out.println(order);
	}
}

class Restaurant {
	String restaurantName;
	String city;

	public Restaurant(String restaurantName, String city) {
		super();
		this.restaurantName = restaurantName;
		this.city = city;
	}

	public String toString() {
		return "Restaurant: " + restaurantName + "\nCity: " + city;
	}
}

class FoodOrder extends Restaurant {
	String orderId;
	double foodAmount;

	public FoodOrder(String restaurantName, String city, String orderId, double foodAmount) {
		super(restaurantName, city);
		this.orderId = orderId;
		this.foodAmount = foodAmount;
	}

	public String toString() {
		return super.toString() + "\nOrder ID: " + orderId + "\nFood Amount: " + foodAmount;

	}
}

class DeliveryOrder extends FoodOrder {
	double deliveryFee;

	public DeliveryOrder(String restaurantName, String city, String orderId, double foodAmount, double deliveryFee) {
		super(restaurantName, city, orderId, foodAmount);
		this.deliveryFee = deliveryFee;
	}

	public String toString() {
		double total = foodAmount + deliveryFee;

		return super.toString() + "\nDelivery Fee: " + deliveryFee + "\nTotal Amount: " + total;
	}
}