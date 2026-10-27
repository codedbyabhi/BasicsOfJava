package com.nit.collectionProgram;

public class CollectionQuestion {

	public static void main(String[] args) 
	{
     MyArray<StringBuilder> ob = new MyArray<StringBuilder>();
     ob.add(new StringBuilder("Hi"));
     System.out.println(ob);
     
	}
}

class MyArray<T>
{
	T value ;
	public void add(T value)
	{
		System.out.println("Given value is "+value);
	}
}