package com.texhlabs.game.number;

public class GuessNumber {
	
	private int randomNumber;
	private int guessedNumber; 
	private int startIndex;
	private int lastIndex;
	
	public GuessNumber(int startIndex, int lastIndex, int assumeNumber) {
		this.randomNumber=assumeNumber;
		this.startIndex=startIndex;
		this.lastIndex=lastIndex;	
	}
	
	
	public int GuessProcess(int startIndex, int lastIndex){
		
		if(randomNumber>=100 || randomNumber<=1) {
			System.out.println("Please enter the number between the given range");
			return 0;
		}
		int mid=(startIndex+lastIndex)/2;
		if(randomNumber>mid) {
			
			startIndex=mid;
			return 1;
		}
		if(randomNumber<mid) {
			lastIndex=mid;
			System.out.println("Number is too low");
		}
		if(mid==randomNumber)
		{
			System.out.println("Number is "+mid);
			return mid;
		}
		else
		return GuessProcess(startIndex, lastIndex);
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public int getGuessedNumber() {
		return guessedNumber;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getLastIndex() {
		return lastIndex;
	}

}
