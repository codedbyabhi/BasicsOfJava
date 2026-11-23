package com.nit.vectorPrograms;

import java.util.Scanner;
import java.util.Vector;

public class InterSectrionOfTwoVectors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		System.out.println("Enter Size of first Vector : ");
		int size1 = sc.nextInt();
		System.out.println("Enter first vector element one by one : ");
		for (int i = 1; i <= size1; v1.add(sc.nextInt()), i++)
			;
		System.out.println("Enter size of second vector : ");
		int size2 = sc.nextInt();
		System.out.println("Enter Second vector element One by one : ");
		for (int i = 1; i <= size2; v2.add(sc.nextInt()), i++)
			;
		v1.retainAll(v2);
		System.out.println(v1);
	}
}