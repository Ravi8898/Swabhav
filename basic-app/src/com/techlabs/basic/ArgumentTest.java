package com.techlabs.basic;

public class ArgumentTest {

	public static void main(String[] args) {
		
		if(args.length>0)
			{
			for(int i=0:args.length)
			{
				System.out.println("Hello "+args[i]);
			
			}
			}
		else
			System.out.println("Please pass the arguments");

	}

}
