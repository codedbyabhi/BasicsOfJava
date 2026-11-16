package com.nit.functinalInterfaces;

import java.util.function.Function;

public class FunctionDemo2 {
	public static void main(String[] args) {
		
		//Function interface converts the value T -> input type to R -> Return type.
		//Function has method called apply();
		
		Function<Integer, String> convert = num -> "Number is : " + num;
		System.out.println(convert.apply(100));
	}

}
