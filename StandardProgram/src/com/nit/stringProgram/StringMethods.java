package com.nit.stringProgram;

import java.lang.System;

public class StringMethods {
	public static void main(String[] args) {

		String s = new String("ABC");
		String s2 = "Hello";
		StringBuffer sb = new StringBuffer("DEF");
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(sb);
		System.out.println(sb.append("Abc"));
		System.out.println(sb.insert(2, "BC"));
		System.out.println(sb.delete(2, 3));
		System.out.println(sb.deleteCharAt(2));
		System.out.println(sb.replace(0, 2, "Abhi"));
		System.out.println(sb.reverse());
		sb.setCharAt(1, 'Z');
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(50);
		System.out.println(sb.append("ABCCC"));
	//	sb.getChars(1, 3, "a", 4);
	}
}
                       