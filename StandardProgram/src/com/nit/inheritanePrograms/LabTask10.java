package com.nit.inheritanePrograms;
import java.util.*;

public class LabTask10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    PremiumType pt = new PremiumType(age);
    pt.classifyPremium();
    
    }
}
class Customer{

    int age;
    Customer(int age){
        this.age=age;
    }
}
class PremiumType extends Customer{
    PremiumType(int age){
        super(age);
    }
    void classifyPremium(){
        if(age>=1 && age<=30){
            System.out.println("Low Premium");
        }
        else if(age>=31 && age<=60){
            System.out.println("Medium Premium");

        }
        else if(age>60) {
            System.out.println("High Premium");
        }
        else{
            System.out.println("Input Format");
        }
    }
    
}