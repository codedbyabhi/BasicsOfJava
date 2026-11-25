package com.nit.streamPrograms;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException{

		FileReader fr = new FileReader("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt");
		int ch;

		while ((ch = fr.read()) != -1) {
			System.out.println((char) ch);

		}
		fr.close();
	}

}
