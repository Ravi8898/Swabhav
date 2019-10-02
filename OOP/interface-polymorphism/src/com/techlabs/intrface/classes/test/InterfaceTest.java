package com.techlabs.intrface.classes.test;

import com.techlabs.intrface.IEmotionable;
import com.techlabs.intrface.IMannerable;
import com.techlabs.intrface.classes.Boy;
import com.techlabs.intrface.classes.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		
		Man x=new Man();
		Boy y=new Boy();
		atThePartyHall(x);
		atThePartyHall(y);
//		atTheMovieHall(x);
		atTheMovieHall(y);
	}
	
	public static void atTheMovieHall(IEmotionable obj) {
		System.out.println("At the Movie");
		obj.cry();
		obj.laugh();
	}
	
	public static void atThePartyHall(IMannerable obj) {
		System.out.println("At the Party");
		obj.wish();
		obj.depart();
	}

}
