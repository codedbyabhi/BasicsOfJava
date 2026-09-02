package com.nit.inheritanePrograms;

import java.util.Scanner;
public class LabTask04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        int creditScore = sc.nextInt();

        CreditCard card = new CreditCard(income, creditScore);
        card.calculateLimit();

        sc.close();
    }
}
class Customer {
    double income;
    int creditScore;

    Customer(double income, int creditScore) {
        this.income = income;
        this.creditScore = creditScore;
    }
}

class CreditCard extends Customer {

    CreditCard(double income, int creditScore) {
        super(income, creditScore);
    }

    void calculateLimit() {
        if (income >= 500000 && creditScore >= 750) {
            System.out.println("Limit: 500000");
        } else if (income >= 400000 && creditScore >= 700) {
            System.out.println("Limit: 200000");
        } else if (income >= 300000 && creditScore >= 650) {
            System.out.println("Limit: 100000");
        } else {
            System.out.println("Rejected");
        }
    }
}