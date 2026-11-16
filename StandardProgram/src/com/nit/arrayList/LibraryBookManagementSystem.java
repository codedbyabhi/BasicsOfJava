package com.nit.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LibraryBookManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Books : ");
		int n = sc.nextInt();
		
		ArrayList<Book> list = new ArrayList<Book>();
		for(int i =1; i<=n; i++) {
			System.out.println("Enter Book Id, Title, AuthorName, Publish Year and Price of : "+i);
			int bookId = sc.nextInt();
			sc.nextLine();
			String bookTitle = sc.nextLine();
			String authorName = sc.nextLine();
			int publicationYear = sc.nextInt();
			double bookPrice = sc.nextDouble();
			list.add(new ReferenceBook(bookId,bookTitle,authorName,publicationYear,bookPrice));
		}
		
	Collections.sort(list);
	System.out.println("Sort By reference Book Asc order");
	Collections.sort(list,(o1,o2)->((ReferenceBook)o1).publicationYear-((ReferenceBook)o2).publicationYear);
	for(Book b : list){
		System.out.println(b);
	}
	System.out.println("Sort By Book Title Asc order");
	Collections.sort(list,(o1,o2)->o1.bookTitle.compareTo(o2.bookTitle));
	for(Book b : list) {
		System.out.println(b);
	}
	System.out.println(list);
	
	}
}

class Book implements Comparable<Book>
{
	public int bookId;
	public String bookTitle;
	public String authorName;

	public Book(int bookId, String bookTitle, String authorName) {

		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}

	public String toString() {
		return "Book [bookId = " + bookId + ", bookTitle = " + bookTitle + ", authorName=" + authorName + "]";
	}

	@Override
	public int compareTo(Book o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}

class ReferenceBook extends Book  {
	public int publicationYear;
	public double bookPrice;

	public ReferenceBook(int bookId, String bookTitle, String authorName, int publicationYear, double bookPrice) {
		super(bookId, bookTitle, authorName);
		this.publicationYear = publicationYear;
		this.bookPrice = bookPrice;
	}

	

	@Override
	public String toString() {
		return "ReferenceBook [publicationYear=" + publicationYear + ", bookPrice=" + bookPrice + ", bookId=" + bookId
				+ ", bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}

	public int compareTo(ReferenceBook o) 
	{
		if (this.publicationYear != o.publicationYear) {

			return this.publicationYear - o.publicationYear;
		} else {
			return this.bookId - o.bookId;
		}
	}

}

class BookTitleComparator implements Comparator<Book> {

	public int compare(Book o1, Book o2) {

		return (o1.bookTitle.compareTo(o2.bookTitle));
	}

}