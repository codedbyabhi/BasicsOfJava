package com.nit.arrayPrograms;

import java.util.Scanner;

public class BookManage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Books :");
		int size = sc.nextInt();
		Book[] a = new Book[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter details of book : " + (i + 1));
			System.out.println("Enter Auther name : ");
			String authorName = sc.nextLine();
			System.out.println("Enter tital : ");
			String tital = sc.nextLine();
			System.out.println("Enter Price  : ");
			double price = sc.nextDouble();
			System.out.println("Enter Published Year : ");
			int publishedYear = sc.nextInt();
			
			a[i]= new Book(authorName, tital, price, publishedYear);
			
		}

	}

}

class Book {
	public String authorName;
	public String tital;
	public double price;
	public int publishedYear;

	public Book(String authorName, String tital, double price, int publishedYear) {
		this.authorName = authorName;
		this.tital = tital;
		this.price = price;
		this.publishedYear = publishedYear;
	}

	public void displayDetails() {

		System.out.println("Title :" + tital);
		System.out.println("Author Name :" + authorName);
		System.out.println("Price :" + price);
		System.out.println("Published year :" + publishedYear);
	}

}
