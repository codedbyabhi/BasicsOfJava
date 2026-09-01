package com.nit.inheritanePrograms;
import java.util.Scanner;

abstract class Employee2 {
    abstract void work();
}

class Manager1 extends Employee2 {
 
    void work() {
        System.out.println("Manager is planning and organizing tasks.");
    }
}

class Engineer extends Employee2 {
   
    Engineer() {
		super();
		
	}

	void work() {
        System.out.println("Engineer is writing code and fixing bugs.");
    }
}

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");

        int choice = sc.nextInt();

        Employee2 emp;

        switch (choice) {
            case 1:
                emp = new Manager1();
                emp.work();
                break;

            case 2:
                emp = new Engineer();
                emp.work();
                break;

            default:
                System.out.println("Invalid Choice. Please select 1 or 2.");
        }

        sc.close();
    }
}