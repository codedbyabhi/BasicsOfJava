package com.nit.inheritanePrograms;

import java.util.Scanner;

public class Qsn01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name,age and breed of the Dog :");
	
	String name = sc.nextLine();
	int age = sc.nextInt();
	sc.nextLine();
	String breed = sc.nextLine();
	
	Dog d = new Dog(name,age, breed);
	d.displayDetails();
	d.eat();
	d.bark();
	}
}
//This is Super class
class Animal{
	
	public String name;
	public int age;
	
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public void eat() {
		System.out.println("Eating food");
	}
	
}
class Dog extends Animal{

	public String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("Breed :"+breed);
	}
	public void bark() {
		
		System.out.println("Dog is barking.....!");
	}
}
	

