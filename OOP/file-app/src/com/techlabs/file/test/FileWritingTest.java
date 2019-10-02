package com.techlabs.file.test;

import java.io.FileWriter;

public class FileWritingTest {

	public static void main(String[] args) throws Exception {
		
		FileWriter file=new FileWriter("Resources\\test.txt", true);
		
		file.write("hello...!!!");
		file.close();
	}

}
