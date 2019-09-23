package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader implements ILoader{

	private BufferedReader bufferReader;

	public FileLoader(String filePath) throws IOException {

		FileReader input;
		input = new FileReader(filePath);
		bufferReader = new BufferedReader(input);

	}

	@Override
	public String load() {

		StringBuilder stringBuilder = new StringBuilder();

		String line = null;
		try {
			line = bufferReader.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		while (line != null) {
			stringBuilder.append(line);
			stringBuilder.append("\n");
			try {
				line = bufferReader.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
		return stringBuilder.toString();
		
	}

//	public String getFileString() throws IOException {
//
//		StringBuilder stringBuilder = new StringBuilder();
//
//		String line = bufferReader.readLine();
//
//		while (line != null) {
//			stringBuilder.append(line);
//			stringBuilder.append("\n");
//			line = bufferReader.readLine();
//
//		}
//		return stringBuilder.toString();
//
//	}

}
