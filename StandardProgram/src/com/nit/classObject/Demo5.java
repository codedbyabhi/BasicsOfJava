package com.nit.classObject;
public class Demo5 {
	public static void main(String[] args) {
		Race re = new Race(10,"BMW");
	}
}
class Race {
	public int model ;
	public String company;
	public double milage;
	public Race(int a, String b, double c) {
		this.company = b;
		System.out.println(model);
	}
	public Race(int a, String b) {
		this.company = b;
		System.out.println(company);
	}
	public Race() {
		System.out.println(milage);
	}
}