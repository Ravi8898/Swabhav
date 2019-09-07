package com.texhlabs.game.number;

public class generateNumber {
	
	int randomNumber=(int) (Math.random()*100);
	GuessNumber generateNumber=new GuessNumber(1, 100, randomNumber);

}
