/*You are developing an International Art Gallery Management System.

The system manages an array of ArtPiece objects.
Each ArtPiece has a nested static class for Artist details.
The system must provide an iterator to traverse the array of ArtPiece objects and display art and artist details sequentially.

Class Details

Create a class named ArtPiece.

Data Members
String artId // unique art identifier
String artName // name of the artwork
double price // price of the artwork

Constructor
ArtPiece(String artId, String artName, double price)
Initializes all fields.

Nested Class

Create a static nested class named Artist inside ArtPiece.

Data Members
String artistName // name of the artist
String country // artist’s country

Constructor
Artist(String artistName, String country)
Initializes all fields.

Method in ArtPiece
printArtDetails()

Logic
Print art ID, name, price.
Print artist name and country.

Iterator Design:
Inside ArtPiece, create a static nested class ArtIterator.

Data Members
ArtPiece[] artArray
int index

Constructor
ArtIterator(ArtPiece[] artArray)
Initializes the array and index = 0

Methods
boolean hasNext() → returns true/false
ArtPiece next() → returns element

Main Class Details
Create a class named GalleryApp.
Create an array of two ArtPiece objects.
Use Scanner to read art and artist details for both objects.
Create ArtIterator object to traverse the array.
Use iterator to print details of all art pieces using printArtDetails().*/
package com.nit.typesOfClasses;

import java.util.*;

public class GalleryApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String artId1 = sc.nextLine();
		String artName1 = sc.nextLine();
		double price1 = sc.nextDouble();
		sc.nextLine();
		String artistName1 = sc.nextLine();
		String country1 = sc.nextLine();

		String artId2 = sc.nextLine();
		String artName2 = sc.nextLine();
		double price2 = sc.nextDouble();
		sc.nextLine();
		String artistName2 = sc.nextLine();
		String country2 = sc.nextLine();
		if (price1 < 0 || price2 < 0) {
			System.out.println("Error: Invalid price");
			System.exit(0);
		}
		ArtPiece[] a = new ArtPiece[2];
		a[0] = new ArtPiece(artId1, artName1, price1, new ArtPiece.Artist(artistName1, country1));
		a[1] = new ArtPiece(artId2, artName2, price2, new ArtPiece.Artist(artistName2, country2));

		for (ArtPiece e : a) {
			e.printArtDetails();
		}
	}
}

class ArtPiece {
	public String artId;
	public String artName;
	public double price;
	public Artist artist;

	public ArtPiece(String artId, String artName, double price, Artist artist) {
		this.artId = artId;
		this.artName = artName;
		this.price = price;
		this.artist = artist;
	}

	static class Artist {
		public String artistName;
		public String country;

		Artist(String artistName, String country) {
			this.artistName = artistName;
			this.country = country;
		}

	}

	public void printArtDetails() {
		System.out.println("Art ID: " + artId);
		System.out.println("Art Name: " + artName);
		System.out.println("Price: " + price);
		System.out.println("Artist: " + artist.artistName);
		System.out.println("Country: " + artist.country);
	}

}