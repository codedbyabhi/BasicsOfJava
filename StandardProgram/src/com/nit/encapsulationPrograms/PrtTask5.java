package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtTask5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MobilePhone m = new MobilePhone();
		System.out.println("Enter Brand: ");
		String brand = sc.nextLine();
		System.out.println("Enter Model: ");
		String model = sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter Volume: ");
		int volume = sc.nextInt();
		System.out.println("Enter Battery Percentage: ");
		int batteryPercentage = sc.nextInt();
		
		m.setBrand(brand);
		m.setModel(model);
		m.setVolume(volume);
		m.setBatteryPercentage(batteryPercentage);
		
		System.out.println("Brand: "+m.getBrand());
		System.out.println("Model: "+m.getModel());
		System.out.println("Volume: "+m.getVolume());
		System.out.println("Battery: "+m.getBatteryPercentage());
	}

}
class MobilePhone{
	private String brand;
	private String model;
	private int volume;
	private int batteryPercentage;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>0 && volume<100) {
		this.volume = volume;
		}
		else {
			this.volume = 0;
		}
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		if(batteryPercentage>0 && batteryPercentage<100) {
		this.batteryPercentage = batteryPercentage;
		}
		else {
			this.batteryPercentage = 0;
		}
	}
	
	
}
