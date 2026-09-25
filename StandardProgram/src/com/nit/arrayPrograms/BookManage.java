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
		System.out.println("========================");
		System.out.println("Enter 1 for getting details of the books by author name.");
		System.out.println("Enter 2 for getting details of the books published after a year.");
		System.out.println("Enter 3 for average price of the book.");
		System.out.println("========================");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch (choice) {

		case 1 -> {

			sc.nextLine();
			System.out.println("Enter author name : ");
			String authorName = sc.nextLine();
			BooksByAuthor(authorName);
		}
		case 2 -> {

			sc.nextLine();
			System.out.println("Enter a year : ");
			int year = sc.nextInt();
			BooksAfterCertainYear(year);
		}
		case 3 -> {
			AvgPriceOfBook();
		}
		default -> {
			System.out.println("Enter valid choice.");
		}
		}

	}

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

			if (b.publishedYear > year) {
				b.displayDetails();
				System.out.println("========================");
			}
		}
	}

	public static void AvgPriceOfBook() {
		double sum = 0;
		for (Book b : a) {
			sum = sum + b.price;
		}
		System.out.println("Avrage price = " + (sum / a.length));
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
