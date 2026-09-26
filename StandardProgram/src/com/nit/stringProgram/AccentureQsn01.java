package com.nit.stringProgram;

import java.util.Scanner;

public class AccentureQsn01 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		for(int i = 0;i<=s.length()-1;i++)
		{
			if(!result.contains(s.charAt(i)+""))
			{
				int count = 0;
				for(int j = 0;j<=s.length()-1;j++)
				{
					if(s.charAt(i)==s.charAt(j)):
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println("First non-repeated : "+s.charAt(i));
					break;
				}
			}
		}
		
		
	}
	
}

