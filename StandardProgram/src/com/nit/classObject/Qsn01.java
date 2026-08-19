package com.nit.classObject;

import java.util.Scanner;

public class Qsn01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bookName : ");
		String bookName = sc.nextLine();
		System.out.println("Enter authorName : ");
		String authorName = sc.nextLine();
		System.out.println("Enter price : ");
		double price = sc.nextDouble();

		Book bk = new Book(bookName, authorName, price);
		bk.displayBookInfo();

	}
}

class Book {

	// Step 1: Declare static and non-static variables.
	public String bookName;
	public String authorName;
	public double price;

	// Step 2: initialize the non-static variable with constructor.
	public Book(String bookName, String authorName, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

	// Step 3: Write any methods required.
	public void displayBookInfo() {

		System.out.println("Book name : " + bookName);
		System.out.println("Author name : " + authorName);
		System.out.println("price : " + price);

	}

	public void issueBook() {

		System.out.println("Book issued successfully : " + bookName);
//		System.out.println();
//		System.out.println();
	}

}
