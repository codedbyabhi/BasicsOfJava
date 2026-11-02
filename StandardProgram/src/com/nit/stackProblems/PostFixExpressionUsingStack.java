package com.nit.stackProblems;

import java.util.Stack;

public class PostFixExpressionUsingStack {
	public static void main(String[] args) {
		String s = "5 1 2 + 4 * + 3 - ";
		String[] a = s.split(" ");
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			String temp = a[i];
			try {
				stack.push(Integer.parseInt(a[i]));
			} catch (NumberFormatException e) {
				int x = stack.pop();
				int y = stack.pop();
				switch (temp) {
				case "+" -> stack.push(y + x);
				case "-" -> stack.push(y - x);
				case "*" -> stack.push(y * x);
				case "/" -> stack.push(y / x);
				case "%" -> stack.push(y % x);
				}
			}
		}
		System.out.println(stack.pop());
	}
}
