package com.techlabs.dogdoors.test;

import com.techlabs.dogdoors.Bark;
import com.techlabs.dogdoors.BarkRecognizer;
import com.techlabs.dogdoors.DogDoor;
import com.techlabs.dogdoors.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {

		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("Woof"));
		
		Remote remote = new Remote(door);
		BarkRecognizer recognizer=new BarkRecognizer(door);
		
		System.out.println("Fido barks to go outside...");
		recognizer.recognize(new Bark("Woof"));
		System.out.println("\nFido has gone outside...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}
		
		System.out.println("\nFido's all done...");
		System.out.println("...But he's stuck outside!");
		
		Bark smallDogBark=new Bark("yip");
		System.out.println("A small dog starts barking.");
		recognizer.recognize(smallDogBark);
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}
		
		System.out.println("Fido starts barking.");
		recognizer.recognize(new Bark("rooowlf"));
		
//		System.out.println("\nFido starts barking...");
//		recognizer.recognize("Woof");

		System.out.println("\nFido's back inside");

	}

}
