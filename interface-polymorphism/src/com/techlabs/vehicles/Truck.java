package com.techlabs.vehicles;

import com.techlabs.vehicles.imoveable.IMoveable;

public class Truck implements IMoveable {

	@Override
	public void move() {
		System.out.println("Truck is moving");

	}

}
