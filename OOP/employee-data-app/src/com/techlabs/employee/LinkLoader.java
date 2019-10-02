package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class LinkLoader {

	private BufferedReader bufferReader;

	public LinkLoader(String link) throws IOException {
		URL url = new URL(link);
		URLConnection connection = url.openConnection();

		InputStreamReader input = new InputStreamReader(connection.getInputStream());
		bufferReader = new BufferedReader(input);

	}
	
	public BufferedReader getBufferReader() {
		return bufferReader;
	}

//	public String getFileString() throws IOException {
//
//		StringBuilder stringBuilder = new StringBuilder();
//		String line = getBufferReader().readLine();
//
//		while (line != null) {
//			stringBuilder.append(line);
//			stringBuilder.append("\n");
//			line = getBufferReader().readLine();
//		}
//		
//		return stringBuilder.toString();
//	}
//
//	public BufferedReader getBufferReader() {
//		return bufferReader;
//	}
}
