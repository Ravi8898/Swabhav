package com.techlabs.log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LogService {

	private static final String INFO = "0";
	private static final String WARNING = "1";
	private static final String ERROR = "2";
	private static String type;
	private static String parameter;

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("Resources\\db_app.log");
		BufferedReader buffer = new BufferedReader(file);
		ArrayList<String> logList = new ArrayList<String>();

		String row;
		
		type=args[0];
		if (args.length == 1) {
			parameter = "";
		}
		else {
			parameter=args[1];
		}
		
		 if(type.equals("-level")) {
			while ((row = buffer.readLine()) != null) {

				String level = getLevel(parameter);
				if (row.contains(level))
					logList.add(row);
			}
			
			
			for(String listIndex:logList)
			System.out.println(listIndex);
		 }
		 
		 else if(type.equals("-help")) {
			 Help.printHelp();
		 }
		 else
			 System.out.println("Please Enter Valid type");
			buffer.close();
		}
	
	public static String getInfo() {
		return INFO;
	}


	public static String getWarning() {
		return WARNING;
	}


	public static String getError() {
		return ERROR;
	}


	public static String getType() {
		return type;
	}


	public static String getParameter() {
		return parameter;
	}


	public static String getLevel(String parameter) {

		switch (parameter) {

		case INFO:
			return "INFO";

		case WARNING:
			return "WARNING";

		case ERROR:
			return "ERROR";
			
		default:
			return "ERROR";

		}
	}
}