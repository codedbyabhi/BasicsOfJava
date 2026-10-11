package com.nit.exceptionPrograms;
import java.util.*;

public class GooglePay_SecureMoneyTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int balance = sc.nextInt();
            int amount = sc.nextInt();
            String pin = sc.next();

            if (pin.length() != 4)
                throw new StringIndexOutOfBoundsException();

            if (amount > balance)
                throw new ArithmeticException();

            balance -= amount;

            System.out.println("Transfer Successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient balance");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid PIN");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        }
    }
}