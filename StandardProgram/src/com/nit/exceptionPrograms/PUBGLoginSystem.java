package com.nit.exceptionPrograms;
import java.util.*;


public class PUBGLoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int playerId = sc.nextInt();
            String password = sc.next();

            if (password.length() < 6) {
                System.out.println("Password too short");
            } else {
                System.out.println("Login Successful");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Player ID");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        }
    }
}