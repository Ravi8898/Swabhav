package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;

public class ToStringConverter {

	public static String getDataString(BufferedReader bufferReader) throws IOException {

		StringBuilder stringBuilder = new StringBuilder();

		String line = bufferReader.readLine();
		
		while (line != null) {
			stringBuilder.append(line);
			stringBuilder.append("\n");
			line = bufferReader.readLine();

		}
		return stringBuilder.toString();

	}
}