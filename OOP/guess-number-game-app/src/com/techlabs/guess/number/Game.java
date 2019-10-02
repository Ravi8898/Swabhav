package com.techlabs.guess.number;

public class Game {
	private int generateNumber = (int) (Math.random() * 101);
	
	public String checkingForMatch(int enterNumber) {
		if (enterNumber > generateNumber) {
			return ("HIGH...!!! TRY AGAIN");
		}
		if (enterNumber < generateNumber) {
			return ("LOW...!!! TRY AGAIN");
		}
		return "MATCHED";
	}
	
	public int getGenerateNumber() {
		return generateNumber;
	}
}
