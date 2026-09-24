package com.nit.arrayPrograms;

import java.util.Scanner;

public class BookManage {
	static Book a[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Books :");
		int size = sc.nextInt();
		a = new Book[size];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter AutherName, Book tital, Price, Published Year of book : " + (i + 1));
			String authorName = IO.readln();
			String tital = IO.readln();
			double price = Double.parseDouble(IO.readln());
			int publishedYear = Integer.parseInt(IO.readln());

			a[i] = new Book(authorName, tital, price, publishedYear);
		}
	}
//		System.out.println("Available Books are : ");
//		for (Book b : a) {
//			b.displayDetails();
//		}
//
//	}

	public static void BooksByAuthor(String authorName) {
		for (Book b : a) {

			if (authorName.equalsIgnoreCase(b.authorName)) {
				b.displayDetails();
				System.out.println("========================");
			}
		}
	}
	public static void BooksAfterCertainYear(int year) {
		for (Book b : a) {

			if (b.publishedYear>year) {
				b.displayDetails();
				System.out.println("========================");
			}
		}
	}
	public static void calculateAvgPrice() {
		for (Book b : a) {

			if () {
				b.displayDetails();
				System.out.println("========================");
			}
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

		System.out.println("Title : " + tital);
		System.out.println("Author Name : " + authorName);
		System.out.println("Price : " + price);
		System.out.println("Published year : " + publishedYear);
	}

}
