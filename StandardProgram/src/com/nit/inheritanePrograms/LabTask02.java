package com.nit.inheritanePrograms;

import java.util.Scanner;

public class LabTask02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String brand = sc.nextLine();
		String operatingSystem = sc.nextLine();
		String gpuModel = sc.nextLine();
		int batteryMAH = sc.nextInt();
		
		GamingPhone gp = new GamingPhone(brand, operatingSystem, gpuModel, batteryMAH);
		
		gp.display();
	}

}
class Mobile{
	
	String brand;
	Mobile(String brand){
		this.brand=brand;
	}
}
class SmartPhone extends Mobile{
	
	String operatingSystem;
	SmartPhone(String brand, String operatingSystem){
		super(brand);
		this.operatingSystem=operatingSystem;
		
	}
}
class GamingPhone extends SmartPhone{
	String gpuModel;
	int batteryMAH;
	
	GamingPhone(String brand,String operatingSystem, String gpuModel, int batteryMAH){
		super(brand,operatingSystem);
		this.gpuModel=gpuModel;
		this.batteryMAH=batteryMAH;
		
	}
	void display() {
		
		System.out.println("GamingPhone Brand: "+brand);
		System.out.println("Operating System: "+operatingSystem);
		System.out.println("GPU: "+gpuModel);
		System.out.println("Battery: "+batteryMAH);
	}
	
	
}