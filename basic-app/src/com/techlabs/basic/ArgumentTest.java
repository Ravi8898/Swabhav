package com.techlabs.basic;

public class ArgumentTest {

	public static void main(String[] args) {
		
		if(args.length>0)
			{
			for(String i:args)
			{
				System.out.println("Hello "+i);			
			}
			}
		else
			System.out.println("Please pass the arguments");

	}

}
