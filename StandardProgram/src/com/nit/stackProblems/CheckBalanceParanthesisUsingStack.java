package com.nit.stackProblems;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalanceParanthesisUsingStack {
	public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    Stack <Character> stack = new Stack <Character>();
//    char ch = sc.next().charAt(0);

		String s = "{[()]}";
		Stack<Character> stack = new Stack<Character>();
		boolean isBalanced = true;
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if ((ch == ')' && stack.pop() != '(') || (ch == ']' && stack.pop() != '[')
					|| (ch == '}' && stack.pop() != '{')) {
				isBalanced = false;
				break;

			}
		}
		if (isBalanced == true && stack.isEmpty()) {
			System.out.println("Balanced Parenthesis String ");
		} else {
			System.out.println(" No A Balance Parenthesis ");
		}

	}
}
