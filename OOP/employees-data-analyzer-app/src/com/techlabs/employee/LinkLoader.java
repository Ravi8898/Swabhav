package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class LinkLoader implements ILoader{

	private BufferedReader bufferReader;

	public LinkLoader(String link) throws IOException {
		URL url = new URL(link);
		URLConnection connection = url.openConnection();

		InputStreamReader input = new InputStreamReader(connection.getInputStream());
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

}
