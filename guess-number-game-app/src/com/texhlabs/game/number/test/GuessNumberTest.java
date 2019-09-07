package com.texhlabs.game.number.test;

import java.util.Scanner;

import com.texhlabs.game.number.GuessNumber;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please assume a number betweeen 1 to 100");
		int assumeNumber=scanner.nextInt();
		System.out.println("is "+assumeNumber+" assumed number?");
		GuessNumber guess=new GuessNumber(1, 100, assumeNumber);
		printInfo(guess);
		scanner.close();
	}
	
	public static void printInfo(GuessNumber n){
		
		System.out.println("Assumed number is "+n.getRandomNumber());
		System.out.println("Guessed number is "+n.getGuessedNumber());
		System.out.println("Lowest value is "+n.getStartIndex());
		System.out.println("Highest value is "+n.getLastIndex());
		
	}

}
