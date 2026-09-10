package com.nit.encapsulationPrograms;

public class PrtTask3 {

}
class Product{
	private int productId;
	private String productName;
	private double price;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		if(productId>0) {
		this.productId = productId;
		}
		else {
			this.productId=0;
		}
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>=0) {
		this.price = price;
		}
	}
	
	double applyDiscount(double percentage) {
		double newPrice;
		if(percentage>0 && percentage<100) {
			double discountAmount = price * percentage/100;
			newPrice = price - discountAmount;
		}
		return newPrice;
		
	}
	
	
}