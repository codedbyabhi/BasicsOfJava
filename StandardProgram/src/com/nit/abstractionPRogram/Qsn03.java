package com.nit.abstractionPRogram;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	int choice = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Food item...");
	String foodItem = sc.nextLine();
	
	DeliveryPartner dp = DeliveryFactory.getPartner(choice);
	OrderService os = new OrderService();
	System.out.println(foodItem);
	os.placeOrder(dp, foodItem);

	}
}
class OrderService{
	
		public void placeOrder(DeliveryPartner partner, String item) {
			
			if(partner.deliverOrder(item)) {
				System.out.println("Order delivered successfully \nEnjoy your meal...");
			}
			else {
				System.out.println("Delivery failed. Try again.");
			}
		}
}
class DeliveryFactory{
	public static DeliveryPartner getPartner(int choice) {
		DeliveryPartner dp = null;
		
		switch(choice) {
		
		case 1 -> dp = new SwiggyDelivery();
		case 2 -> dp = new ZomatoDelivery();		
		case 3 -> dp = new DunzoDelivery();
		
		}
		return dp;
	}
}
interface DeliveryPartner {

	boolean deliverOrder(String item);
}

class SwiggyDelivery implements DeliveryPartner {

	public boolean deliverOrder(String item) {
		
		System.out.println("Delivery is done via Swiggy");
		return true;
	}

}

class ZomatoDelivery implements DeliveryPartner {

	public boolean deliverOrder(String item) {

		System.out.println("Delivery is done via Zomato");
		return true;
	}

}

class DunzoDelivery implements DeliveryPartner {

	public boolean deliverOrder(String item) {

		System.out.println("Delivery is done via Dunzo");
		return true;
	}

}