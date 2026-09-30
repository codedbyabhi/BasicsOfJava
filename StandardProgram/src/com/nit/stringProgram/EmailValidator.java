package com.nit.stringProgram;

import java.util.Scanner;

public class EmailValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		if (s.contains("@")) {
			System.out.println("Email is valid.");
		} else {
			System.out.println("Invalid email: missing '@' symbol.");

		}

	}
}
