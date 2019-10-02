package com.techlabs.basic;

public class OverloadingTest {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println(true);
		System.out.println('a');
		System.out.println(45);
		System.out.println(1.325);
	
		
		printThis(10);
		printThis(10.5);
		printThis(10.55f);
		printThis('a');
		printThis("Hii...!!!");
	}
	
	public static void printThis(int number) {
		System.out.println(number);
		
	}
	public static void printThis(double number) {
		System.out.println(number);
		
	}
	public static void printThis(float number) {
		System.out.print("This is float ");
		System.out.println(number);
		
	}
	public static void printThis(char character) {
		System.out.println(character);
		
	}
	public static void printThis(String string) {
		System.out.println(string);
		
	}

}
