package com.nit.basicsofjava;

import java.util.Scanner;

public class RelationalOperator1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter number of rides in the area: ");
        int rides = sc.nextInt();

        //System.out.print("Enter maximum threshold of rides: ");
        int max_threshold = sc.nextInt();

        //System.out.print("Enter current time in hours (0-23): ");
        int time = sc.nextInt();

        if (rides >= max_threshold && time < 24) {
            System.out.println("Surge Pricing ON");
        } else {
            System.out.println("Normal Pricing");
        }

        sc.close();
    }
}