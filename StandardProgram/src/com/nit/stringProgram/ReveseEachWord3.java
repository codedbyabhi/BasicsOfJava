//By using Array. this is 3 way.
package com.nit.stringProgram;

import java.util.Scanner;

public class ReveseEachWord3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String[] a = s.split(" ");
		String result = "";

		for (int i = 0; i <= a.length - 1; i++) {
			String rev = "";
			for (int j = a[i].length() - 1; j >= 0; j--) {

				rev += a[i].charAt(j);
			}
			result = result + rev + " ";
		}
		System.out.println(result.trim());
	}

}
