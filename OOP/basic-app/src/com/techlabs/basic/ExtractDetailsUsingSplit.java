package com.techlabs.basic;

public class ExtractDetailsUsingSplit {

	public static void main(String[] args) {
		
		if(args.length>0) {
			String url=args[0];
			getDetails(url);
			
		}
		else
			System.out.println("Please enter the URL");

	}
	
	public static void getDetails(String url) {
		
		String[] string=url.split("www.");

		String firstStr=string[0];
		String secondStr=string[1];
		
		string=secondStr.split(".com");
		firstStr=string[0];
		secondStr=string[1];
		String company=firstStr;
		System.out.println("Company---> "+company);
		
		string=secondStr.split("student=");
		firstStr=string[0];
		secondStr=string[1];
		string=secondStr.split("&");
		String student=string[0];
		System.out.println("Student---> "+student);
		
		string=secondStr.split("location=");
		firstStr=string[0];
		secondStr=string[1];
		String location=secondStr;
		System.out.println("Location---> "+location);
	}

}
