package com.nit.hasArelationshipProgram;

import java.util.Scanner;

public class UpdateDriverScenario {

	    public static void main(String []args){

	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        sc.nextLine();

	        String brand=sc.nextLine();
	        String model=sc.nextLine();
	        int year = sc.nextInt();
	        sc.nextLine();

	        String name = sc.nextLine();
	        int age = sc.nextInt();

	        Driver d = new Driver(name, age);
	        Car1 car1 = new Car1(brand, model, year,d);
	        Car1 car2 = new Car1(car1);

	        if(choice==1){
	            sc.nextLine();
	            String newName = sc.nextLine();
	            int newAge = sc.nextInt();

	            car1.changeDriver(new Driver(newName,newAge));

	            System.out.println("After Driver Update :");
	        }
	        else{
	            System.out.println("No Driver Change :");
	        }
	        System.out.println("Car 1: "+car1.getDetails());
	        System.out.println("Car 2: "+car2.getDetails());
	    }
	}
	class Driver{

	    private String name;
	    private int age;

	    public Driver(String name, int age){
	        this.name=name;
	        this.age=age;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setName(String name){
	        this.name=name;
	    }
	    public int getAge(){
	        return age;
	    }
	    public void setAge(int age){
	        this.age=age;
	    }
	}
	class Car1{
	    private String brand;
	    private String model;
	    private int year;
	    private Driver driver;
	    Car1(String brand, String model, int year, Driver driver){
	        this.brand=brand;
	        this.model=model;
	        this.year=year;
	        this.driver=driver;
	    }
	    Car1(Car1 c){
	        this.brand=c.brand;
	        this.model=c.model;
	        this.year=c.year;
	        this.driver= new Driver(c.driver.getName(),c.driver.getAge());
	        
	    }
	    public Driver getDriver(){
	        return driver;
	    }
	    public void changeDriver(Driver driver){
	        this.driver=driver;
	    }
	    public String getDetails(){
	        return brand+" "+model+" (" +year+ "), Driver: "+driver.getName()+" ("+driver.getAge() +")";
	    }
	}

