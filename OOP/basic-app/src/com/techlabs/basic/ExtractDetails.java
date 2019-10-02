package com.techlabs.basic;

public class ExtractDetails {

	public static void main(String[] args) {
		
		if(args.length>0) {
		String url=args[0];
		int studentLength=7;
		int locationLength=8;
		String company=url.substring(url.indexOf(".")+1, url.indexOf(".c"));
		String student=url.substring(url.indexOf("student")+studentLength+1, url.indexOf("&"));
		String location=args[0].substring(url.indexOf("Location")+locationLength+1);
		
		System.out.println("Company-->"+company);
		System.out.println("Student-->"+student);
		System.out.println("Location-->"+location);
		}
		else
			System.out.println("Please enter the URL");
	}

}
