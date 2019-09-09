package com.techlabs.property;

import java.io.FileReader;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) throws Exception {
		
		FileReader propertyFile=new FileReader("src/Information.properties");
		Properties information=new Properties();  
		information.load(propertyFile);
		System.out.println(information.getProperty("Ratings"));
		
	}

}
