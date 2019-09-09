package com.techlabs.interfaces.test;

import com.techlabs.interfaces.SwipeCard;

public class AtmCardTest {

	public static void main(String[] args) {
		
		SwipeCard atmCard=new SwipeCard();
		printInfo(atmCard);
	}
	public static void printInfo(SwipeCard atmCard) {
		atmCard.miniStatement();
		atmCard.checkBalance();
		atmCard.withdraw();
	}

}

