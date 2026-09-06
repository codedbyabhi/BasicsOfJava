package com.nit.inheritanePrograms;

import java.util.*;

public class TestLab01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalProfit = sc.nextDouble();
		Son s = new Son(totalProfit);
		s.calculateShare();
	}
}

class Grandfather {
	double totalProfit;

	Grandfather(double totalProfit) {
		this.totalProfit = totalProfit;
	}

	double calculateShare() {
		double grandfatherShare = ((totalProfit * 20) / 100);
		System.out.println("Grandfather Share: " + grandfatherShare);
		return grandfatherShare;
	}
}

class Father extends Grandfather {
	Father(double totalProfit) {
		super(totalProfit);
	}

	double calculateShare() {
		super.calculateShare();
		double fatherShare = ((totalProfit * 30) / 100);
		System.out.println("Father Share: " + fatherShare);
		return fatherShare;
	}
}

class Son extends Father {
	Son(double totalProfit) {
		super(totalProfit);

	}

	double calculateShare() {
		super.calculateShare();
		double sonShare = totalProfit - ((totalProfit * 20) / 100) - ((totalProfit * 30) / 100);
		System.out.println("Son Share: " + sonShare);
		return sonShare;
	}
}
