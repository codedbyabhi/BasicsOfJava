package com.nit.CursorPrograms;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>(Arrays.asList(23, 24, 25, 26, 27));
//		for (int i = 1; i <= v.size(); i++) {
//			if (v.get(i) % 2 == 0) {
//				System.out.println(v.get(i));
//			}
//		}
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			Integer temp = en.nextElement();
			if (temp % 2 == 0) {
				System.out.println(temp);
			}
		}
	}
}
