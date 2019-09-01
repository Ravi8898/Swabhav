package com.techlabs.basic;

public class PassByValueTest {

	public static void main(String[] args) {
		
		int marks=100;
		changeMarksToZero(marks);
		System.out.println(marks);
		
		int[] mark= {10,20,30};
		changeMarksToZero(mark);
		for(int m:mark) {
		System.out.println(m);
		}
	}
	public static void changeMarksToZero(int markPassed) {
		
		markPassed=0;
		
	}
	public static void changeMarksToZero(int[] marksPassed) {
		
		for(int i=0; i<marksPassed.length; i++) {
			marksPassed[i]=0;
		}
	}
}