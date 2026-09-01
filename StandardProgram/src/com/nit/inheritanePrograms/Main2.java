package com.nit.inheritanePrograms;
import java.util.Scanner;

abstract class MeDemo {
    abstract void method();
}

class DemoImpl extends MeDemo {

    void method() {
        System.out.println("Method executed successfully.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");

        int choice = sc.nextInt();

        MeDemo obj = new DemoImpl();

        if (choice == 1) {
            obj.method();
        } else if (choice == 0) {
            System.out.println("Invalid choice.");
        }
        else {
        	System.out.println("Choice between 0 or 1.");
        }

        sc.close();
    }
}