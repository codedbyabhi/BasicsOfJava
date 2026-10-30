package com.nit.hashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class LibraryManagermentSystem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		System.out.println("Enter number of Books : ");
		
		int n = sc.nextInt();
		for(int i =1; i<=n;i++) {
			System.out.println("Enter BookID, name and Quantity of Book : "+i);
			
			int bookId = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int quantity = sc.nextInt();
			l.addBook(new Book(bookId, name,quantity));
		}
		System.out.println();
		System.out.println("Enter the Book ID and new Quantity : ");
		int newBookId = sc.nextInt();
		int newQuantity = sc.nextInt();
		l.updateQuantity(newBookId, newQuantity);
		
		System.out.println("Enter book id to display");
		int searchId = sc.nextInt();
		l.display(searchId);
		
	}

}

class Library {

	public Hashtable<Integer, Book> table = new Hashtable<Integer, Book>();

	public void addBook(Book b) {

		table.put(b.getBookId(), b);
		System.out.println(b.getBookName() + " is added successfully...");
	}

	public void updateQuantity(int id, int quantity) {

		if (table.containsKey(id)) {

			table.get(id).setQuantity(quantity);
		} else {

			System.out.println("Book not found");
		}

	}

	public void display(int id) {

		if (table.containsKey(id)) {
			
			System.out.println(table.get(id));
		} 
		else {
			System.out.println("Book not found");
		}

	}

}

class Book {

	private int bookId;
	private String bookName;
	private int quantity;

	public Book(int bookId, String bookName, int quantity) {

		this.bookId = bookId;
		this.bookName = bookName;
		this.quantity = quantity;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Book [bookId = " + bookId + ", bookName = " + bookName + ", quantity = " + quantity + "]";
	}
}
