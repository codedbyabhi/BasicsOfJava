package com.nit.objectMethods;

public class LibraryApp {

}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    }
}

class Book implements Cloneable{
    public String bookId;
    public String title;
    public String author;
    public double price;

    public Book(String bookId, String title, String author, double price){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.price=price;

    }

    public Book clone() throws CloneNotSupportedException{
        return Book
    }
}
