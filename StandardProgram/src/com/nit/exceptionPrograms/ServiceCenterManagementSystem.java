package com.nit.exceptionPrograms;

import java.util.*;

public class ServiceCenterManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static int customerId;
    static String customerName;
    static boolean registered = false;

    static void registerCustomer() {
        customerId = sc.nextInt();
        sc.nextLine();
        customerName = sc.nextLine();
        registered = true;
        System.out.println("Customer registered successfully");
    }

    static void bookService() {
        int id = sc.nextInt();
        sc.nextLine();
        String service = sc.nextLine().trim();

        if (!registered || customerId != id)
            throw new NullPointerException("Customer record not found");

        if (!service.equals("Repair"))
            throw new IllegalArgumentException("Invalid service type");

        System.out.println("Service booked: " + service);
    }

    static void generateBill() {
        int id = sc.nextInt();
        int cost = sc.nextInt();

        if (!registered || customerId != id)
            throw new NullPointerException("Customer record not found");

        if (cost <= 0)
            throw new ArithmeticException("Invalid service cost");

        System.out.println("Service bill generated: " + cost);
    }

    public static void main(String[] args) {
    	System.out.println("Enter Details : ");
        while (true) {
            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        registerCustomer();
                        break;
                    case 2:
                        bookService();
                        break;
                    case 3:
                        generateBill();
                        break;
                    case 4:
                        System.out.println("Exiting Service Center System");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}