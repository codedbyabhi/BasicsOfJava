package com.nit.streamPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;

		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
	}
}
