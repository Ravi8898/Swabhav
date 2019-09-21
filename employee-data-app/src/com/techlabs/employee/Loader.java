package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Loader {

	BufferedReader bufferReader;
	public Loader(String link) throws IOException {
		URL url = new URL(link);
		URLConnection connection = url.openConnection();
		InputStreamReader input = new InputStreamReader(connection.getInputStream());
		bufferReader=new BufferedReader(input);
		
	}
}
