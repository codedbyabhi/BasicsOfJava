package com.nit.inheritanePrograms;

import java.util.Scanner;

public class TestLab03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String power = sc.nextLine();
		int flyingSpeed = sc.nextInt();
		FlyingSuperhero fs = new FlyingSuperhero(name, power, flyingSpeed);
		fs.displayFlyingHero();
	}
}

class Superhero {
	String name;
	String power;

	Superhero(String name, String power) {
		this.name = name;
		this.power = power;
	}

	void displayHero() {
		System.out.println("Name: " + name);
		System.out.println("Power: " + power);
	}
}

class FlyingSuperhero extends Superhero {
	int flyingSpeed;

	FlyingSuperhero(String name, String power, int flyingSpeed) {
		super(name, power);
		this.flyingSpeed = flyingSpeed;
	}

	void displayFlyingHero() {
		System.out.println("Superhero Details:");
		super.displayHero();
		System.out.println();

		System.out.println("Flying Details:");
		System.out.println("Flying Speed: " + flyingSpeed + " km/h");
	}
}
