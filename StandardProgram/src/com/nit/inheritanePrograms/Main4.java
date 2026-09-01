package com.nit.inheritanePrograms;
import java.util.*;

abstract class Product1 {
    private String name;
    private double price;
    private String category;

    Product1(String name, double price, String category) {
        if (price < 0)
            throw new IllegalArgumentException();

        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract public void applyDiscount(double percentage);
    abstract public double calculateTax();
}

class DigitalProduct extends Product1 {
    private String licenseKey;

    DigitalProduct(String n, double p, String c, String l) {
        super(n, p, c);
        licenseKey = l;
    }

    public void applyDiscount(double per) {
        double d = getPrice() * per / 100;
        setPrice(getPrice() - d);
        System.out.println("Discount : " + d);
        System.out.println("New Price : " + getPrice());
    }

    public double calculateTax() {
        return getPrice() * 5 / 100;
    }

    public String toString() {
        return "Digital Product:\nProduct Name : " + getName() +
               "\nCategory : " + getCategory() +
               "\nPrice : " + getPrice() +
               "\nLicense Key : " + licenseKey;
    }
}

class PhysicalProduct extends Product1 {
    private double shippingWeight;

    PhysicalProduct(String n, double p, String c, double w) {
        super(n, p, c);
        shippingWeight = w;
    }

    public void applyDiscount(double per) {
        double d = getPrice() * per / 100;
        setPrice(getPrice() - d);
        System.out.println("Discount : " + d);
        System.out.println("New Price : " + getPrice());
    }

    public double calculateTax() {
        return getPrice() * 8 / 100;
    }

    public double calculateShippingCost() {
        return shippingWeight * 5;
    }

    public String toString() {
        return "Physical Product:\nProduct Name : " + getName() +
               "\nCategory : " + getCategory() +
               "\nPrice : " + getPrice() +
               "\nShipping Weight : " + shippingWeight + " KG";
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");

        try {
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                String n = sc.nextLine();
                double p = sc.nextDouble();
                sc.nextLine();
                String c = sc.nextLine();
                String l = sc.nextLine();
                double d = sc.nextDouble();

                DigitalProduct x = new DigitalProduct(n, p, c, l);
                System.out.println(x);
                x.applyDiscount(d);
                System.out.println("Tax : " + x.calculateTax());

            } 
            else if (ch == 2) {
                String n = sc.nextLine();
                double p = sc.nextDouble();
                sc.nextLine();
                String c = sc.nextLine();
                double w = sc.nextDouble();
                double d = sc.nextDouble();

                PhysicalProduct x = new PhysicalProduct(n, p, c, w);
                System.out.println(x);
                x.applyDiscount(d);
                System.out.println("Tax : " + x.calculateTax());
                System.out.println("Shipping Cost : " + x.calculateShippingCost());

            } 
            else {
                System.out.println("Error Invalid Input.");
            }

        } catch (Exception e) {
            System.out.println("Error Invalid Input.");
        }
    }
}
