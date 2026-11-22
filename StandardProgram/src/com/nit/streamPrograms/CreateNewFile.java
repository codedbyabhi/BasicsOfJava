package com.nit.streamPrograms;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {

//		File f = new File("C:\\This PC\\NareshIT\\CoreJava\\Something\\xyz.txt");
		File f1 = new File("C:\\This PC\\NareshIT\\CoreJava\\Something\\bikes");
		File f2 = new File("C:\\This PC\\NareshIT\\CoreJava\\Something");

//		f.createNewFile(); //THis one Create file

		f1.mkdir(); // This create Folder
//		f1.delete(); // This delete Folder Or File

//		System.out.println(f1.isDirectory());
//		System.out.println(f1.isFile());
//		
		for (String s : f2.list()) {
			if (new File(f2, s).isDirectory()) {

				System.out.println(s);
			}
		}
	}
}
