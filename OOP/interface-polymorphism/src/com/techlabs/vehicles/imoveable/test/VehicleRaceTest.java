package com.techlabs.vehicles.imoveable.test;

import com.techlabs.vehicles.Bike;
import com.techlabs.vehicles.Car;
import com.techlabs.vehicles.Truck;
import com.techlabs.vehicles.imoveable.IMoveable;

public class VehicleRaceTest {

	public static void main(String[] args) {
		Truck truck = new Truck();
		startRace(truck);

		Car car = new Car();
		startRace(car);

		Bike bike = new Bike();
		startRace(bike);
		System.out.println();
		IMoveable[] moveable = { truck, car, bike };
		startRace(moveable);
	}

	public static void startRace(IMoveable obj) {
		obj.move();

	}

	public static void startRace(IMoveable[] moveable) {

		System.out.println("Start Race");
		for (IMoveable vehicle : moveable) {
			vehicle.move();
		}

		System.out.println("End Race");

	}
}
