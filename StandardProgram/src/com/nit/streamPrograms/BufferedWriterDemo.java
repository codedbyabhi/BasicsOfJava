package com.nit.streamPrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\This PC\\NareshIT\\CoreJava\\Something\\abc.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.newLine();
		bw.write("Mohit");
		bw.close();

	} 		
}
