package com.techlabs.vehicles;

import com.techlabs.vehicles.imoveable.IMoveable;

public class Car implements IMoveable {

	@Override
	public void move() {
		System.out.println("Car is moving");

	}

}
