package com.techlabs.log.test;

import java.io.BufferedReader;
import java.io.FileReader;

import com.techlabs.log.Help;

public class LogTest {

	private static final String zero = "0";
	private static final String one = "1";
	private static final String two = "2";
	private static String help;
	private static String parameter;

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("Resources\\db_app.log");
		BufferedReader buffer = new BufferedReader(file);
		String[] strLine = null;
		String str;

		if (args.length == 1) {
			parameter = "";
			help = args[0];
		}

		else
			parameter = args[1];
		help = args[0];

		if (help.equals("-help")) {
			Help.printHelp();
		} else {
			while ((str = buffer.readLine()) != null) {
				strLine = str.split(" ");
				for (String word : strLine) {

					printLogInfo(parameter, word, str);
				}
			}
		}
		buffer.close();
	}

	public static void printLogInfo(String parameter, String word, String str) {

		switch (parameter) {
		case zero:
			if (word.equals("INFO")) {
				System.out.println(str);
			}
			break;
		case one:
			if (word.equals("WARNING")) {
				System.out.println(str);
			}
			break;
		case two:
			if (word.equals("ERROR")) {
				System.out.println(str);
			}
			break;

		default:
			if (word.equals("ERROR")) {
				System.out.println(str);
			}

		}
	}

}
