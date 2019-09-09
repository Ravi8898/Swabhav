package com.techlabs.human.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.techlabs.human.GenderCategory;
import com.techlabs.human.Human;

public class SerializationTest {
	
	public static void main(String[] args) throws IOException, Exception {
		Human human1 = new Human("Durga", 40, GenderCategory.Female, 6, 50);
		printInfo(human1);
		while (human1.getWeight() > 40) {
			human1.workOut();
		}
		
		FileOutputStream serializeFile = new FileOutputStream("Resources/human.ser");
		ObjectOutputStream saveHumanDetails = new ObjectOutputStream(serializeFile);
		saveHumanDetails.writeObject(human1);
		saveHumanDetails.close();
		printInfo(human1);
		
		FileInputStream deserializeFile=new FileInputStream("Resources/human.ser");
		ObjectInputStream updatedDetail=new ObjectInputStream(deserializeFile);
		Human human1Restore=(Human) updatedDetail.readObject();
		printInfo(human1Restore);
		updatedDetail.close();
	}

public static void printInfo(Human h) {
		
		System.out.println("Name of the human is: " + h.getName());
		System.out.println("Age of the human is: " + h.getHeight());
		System.out.println("Weight of the human is: " + h.getWeight());
		System.out.println();
	}
}
