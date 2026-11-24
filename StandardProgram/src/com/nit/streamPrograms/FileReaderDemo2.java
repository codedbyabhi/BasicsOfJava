package com.nit.streamPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt");
		FileReader fr = new FileReader("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt");
		char [] a = new char[(int)f.length()];
		fr.read(a);
		for(char ch : a) {
			System.out.print(ch);
		}
		fr.close();
	}
}
