package com.nit.vectorPrograms;

import java.util.Scanner;
import java.util.Vector;

public class MergeAndRemoveOfVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		System.out.println("Enter number of elements in first vector : ");
		int size1 = sc.nextInt();
		System.out.println("Enter first vector number one by one : ");
		for (int i = 1; i <= size1; i++) {
			v1.add(sc.nextInt());
		}
		System.out.println("Enter number of elements in Second vector : ");
		int size2 = sc.nextInt();
		System.out.println("Enter Second vector number one by one : ");
		for (int i = 1; i <= size1; i++) {
			v2.add(sc.nextInt());
		}
		v2.addAll(v1);
		Vector<Integer> result = new Vector<Integer>();
		for (Integer e : v2) {
			if (!result.contains(e))
				result.add(e);
		}
		System.out.println("Result : " + result);
	}

}
