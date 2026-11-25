package com.nit.streamPrograms;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterDemo {

	public static void main(String[] args) throws IOException {

//		File f = new File("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt");

		FileWriter fw = new FileWriter("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt", true);
		// this true means keep what's in file and add this other too.

		char[] a = { 'A', 'B', 'C' };
		fw.write(a);
		fw.write("\nMs Dhoni");
		fw.close();

	}
}
