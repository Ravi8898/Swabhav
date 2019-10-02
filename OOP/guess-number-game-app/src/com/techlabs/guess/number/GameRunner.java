package com.techlabs.guess.number;

import java.util.Scanner;

public class GameRunner {
	int enterNumber;

	public void start() {
		Game newGame =new Game(); 
		
		int generatedNumber=newGame.getGenerateNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess the number");

		while (enterNumber != generatedNumber) {
			enterNumber = scanner.nextInt();
			System.out.println(newGame.checkingForMatch(enterNumber));
		}

		scanner.close();
	}
}
