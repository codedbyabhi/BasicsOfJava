package com.nit.abstractionPRogram;

public class Qsn03 {

}
class OrderService{
	
	
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