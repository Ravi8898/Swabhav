package com.techlabs.file.test;

import java.io.FileReader;

public class FileReadingTest {

	public static void main(String[] args) throws Exception {

		FileReader file=new FileReader("D:\\Swabhav_Repository\\test.txt");
		
		int i;
		while((i=file.read())!=-1) {
			System.out.print((char) i);
		}
		file.close();
	}

}
