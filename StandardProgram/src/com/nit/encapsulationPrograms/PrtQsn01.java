package com.nit.encapsulationPrograms;

import java.util.Scanner;

public class PrtQsn01 {

	    public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     String name = sc.nextLine();
	     double price = sc.nextDouble();
	     String category = sc.nextLine();
	     category = sc.nextLine();
	     Product p = new Product(name, price, category);
	    
	     p.displayDetails();
	        //System.out.println("Category : "+p.getCategory());

	        
	    }
	}
	class Product{
	   
	    private String name;
	    private double price;
	    private String category;

	    public Product(String name, double price, String category){
	        if (price <= 0) {
	            System.out.println("Invalid Price, Price should be greater than 0.");
	            System.exit(0);
	            
	        }
	        

	        this.name=name;
	        this.price=price;
	        this.category=category;
	        
	    }

	    public void displayDetails(){

	        System.out.println("Product Details:");
	        System.out.println("Name : "+name);
	        System.out.println("Price : "+price);
	        System.out.println("Category : "+category);

	    }
	    public String getName(){
	        return name;
	    }
	    public double getPrice(){
	        return price;
	    }
	    public String getCategory(){
	        return category;
    }

}


