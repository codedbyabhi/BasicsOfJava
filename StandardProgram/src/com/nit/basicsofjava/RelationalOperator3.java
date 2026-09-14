package com.nit.basicsofjava;

import java.util.Scanner;

public class RelationalOperator3 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        //System.out.print("Enter current seat class: ");
	        int currentClass = sc.nextInt();

	        //System.out.print("Enter requested seat class: ");
	        int requestedClass = sc.nextInt();

	       // System.out.print("Enter wallet balance: ");
	        double balance = sc.nextDouble();

	        //System.out.print("Enter upgrade fee: ");
	        double fee = sc.nextDouble();

	        //System.out.print("Enter time since booking in hours: ");
	        int time = sc.nextInt();

	        if (requestedClass > currentClass
	                && balance >= fee
	                && time <= 24) {

	            System.out.println("Upgrade Successful");

	        } else {
	            System.out.println("Upgrade Failed");
	        }

	        sc.close();
	    }
	}

