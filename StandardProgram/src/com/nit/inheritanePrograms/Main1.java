package com.nit.inheritanePrograms;
import java.util.Scanner;

abstract class RemoteControl {
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends RemoteControl {

   
    void turnOn() {
        System.out.println("TV is turned ON");
    }

  
    void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");

        int choice = sc.nextInt();

        // Runtime Polymorphism
        RemoteControl remote = new TVRemote();

        switch (choice) {
            case 1:
                remote.turnOn();
                break;

            case 2:
                remote.turnOff();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}