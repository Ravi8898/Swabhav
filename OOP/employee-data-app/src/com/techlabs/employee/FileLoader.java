package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

	private BufferedReader bufferReader;

	public FileLoader(String filePath) throws IOException {

		FileReader input;
		input = new FileReader(filePath);
		bufferReader = new BufferedReader(input);

	}

	public BufferedReader getBufferReader() {
		return bufferReader;
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
