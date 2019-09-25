package com.techlabs.factory.method;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileLoader {

	Properties properties = new Properties();

	public PropertyFileLoader() throws IOException {
		FileReader fileReader = new FileReader("Resources/factory.properties");
		properties.load(fileReader);

	}


	public String getProperties() {
		return properties.getProperty("factory");
	}
}