package com.techlabs.vehicles;

import com.techlabs.vehicles.imoveable.IMoveable;

public class Bike implements IMoveable {

	@Override
	public void move() {
		System.out.println("Bike is moving");

	}

}
