package com.nit.arrayPrograms;

import java.util.Scanner;

public class Qsn39 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i <=a.length-1; i++) 
		{
			boolean isPreviouslyPresent = false;
			for (int j = 0; j <=i-1; j++) 
			{

				if (a[j] == a[i]) 
				{
					isPreviouslyPresent = true;
					break;
				}
			}
			if (isPreviouslyPresent == false) 
			{
				int count = 0;
				for (int j = 0; j <= a.length - 1; j++) 
				{
					if (a[j] == a[i]) 
					{
						count++;
					}
				}
				System.out.println(a[i] + " repeated : " + count + "time(s)");
			}

		}

	}

}