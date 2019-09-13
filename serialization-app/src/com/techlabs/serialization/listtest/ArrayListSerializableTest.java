package com.techlabs.serialization.listtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.serialization.Human;

public class ArrayListSerializableTest {

	public static void main(String[] args) throws Exception {

		ArrayList<Human> humansList = new ArrayList<Human>();
		Human h1 = new Human("Ravi", 23, 54);
		humansList.add(h1);
		Human h2 = new Human("Sunny", 21, 74);
		humansList.add(h2);

		FileOutputStream serializeFile = new FileOutputStream("Resources/humanFile");
		ObjectOutputStream objectSeriealize = new ObjectOutputStream(serializeFile);
		objectSeriealize.writeObject(humansList);
		objectSeriealize.close();

		FileInputStream deserialize = new FileInputStream("Resources/humanFile");
		ObjectInputStream objectDeseralize = new ObjectInputStream(deserialize);
		humansList = (ArrayList<Human>) objectDeseralize.readObject();

		printList(humansList);
		objectDeseralize.close();

	}

	public static void printList(ArrayList<Human> list) {

		for (Human h : list) {
			System.out.println(h);
		}
	}

}
