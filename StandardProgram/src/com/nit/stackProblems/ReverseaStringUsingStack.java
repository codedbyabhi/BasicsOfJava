package com.nit.stackProblems;

import java.util.Scanner;
import java.util.Stack;

public class ReverseaStringUsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String ");
		String s = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		String result = "";
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			result += stack.pop();
		}
		System.out.println(result);
	}
}
