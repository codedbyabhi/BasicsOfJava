package com.nit.inheritanePrograms;

import java.util.Scanner;

public class LabTask01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String status = sc.nextLine();
		CheckUp c = new CheckUp(name, status);
		
		c.display();
	}

}
class Patient{
	 String name;

	public Patient(String name) {
		this.name = name;
	}
}
class CheckUp extends Patient{
	 
	String status;
	
	 public CheckUp(String name, String status) {
		super(name);
		this.status=status;
		
	}
	 void display() {
		 System.out.println("Patient: " + name + " | Checkup: " + status);
	 }
}
