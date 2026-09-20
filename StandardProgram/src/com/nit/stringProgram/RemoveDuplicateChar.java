package com.nit.stringProgram;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String s = "ABHIIII";
		String result = "";
		for (int i = 0; i < s.length() - 1; i++) {
			
			char ch = s.charAt(i);
			if(!result.contains(""+ch)) {
				result+=ch;
			}
		}
		System.out.println("Result : "+result);
	}

}
