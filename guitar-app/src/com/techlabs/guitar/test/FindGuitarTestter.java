package com.techlabs.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Instrument;
import com.techlabs.guitar.InstrumentSpec;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class FindGuitarTestter {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		InstrumentSpec whatErinLikes = new InstrumentSpec(Builder.GIBSON, "Model-3", Type.ELECTRIC, 5, Wood.MAHOGANY,
				Wood.MAHOGANY);
		List matchingGuitar = inventory.search(whatErinLikes);
		if (!matchingGuitar.isEmpty()) {
			System.out.println("Erin, you might like this guitars: ");
			for (Iterator i = matchingGuitar.iterator(); i.hasNext();) {
				Instrument guitar = (Instrument) i.next();
				InstrumentSpec spec = guitar.getSpec();
				System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n" + spec.getBackWood() + " back wood,\n" + spec.getTopWood()
						+ " top wood.\nYou can have it for only Rs." + guitar.getPrice());
			}

		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {

		inventory.addGuitar("101", 999, new InstrumentSpec(Builder.MARTIN, "Stratocaster", Type.ACOUSTIC, 3, Wood.MAHOGANY, Wood.ADIRONDACK));
		inventory.addGuitar("102", 1099, new InstrumentSpec(Builder.MARTIN, "Model-1", Type.ACOUSTIC,4, Wood.BRAZILIAN_ROSEWOOD,
				Wood.ADIRONDACK));
		inventory.addGuitar("103", 1199, new InstrumentSpec(Builder.GIBSON, "Model-2", Type.ELECTRIC,6, Wood.MAHOGANY, Wood.MAHOGANY));
		inventory.addGuitar("104", 1599, new InstrumentSpec(Builder.GIBSON, "Model-3", Type.ELECTRIC,5, Wood.MAHOGANY,
				Wood.MAHOGANY));
		inventory.addGuitar("105", 2099, new InstrumentSpec(Builder.MARTIN, "Model-4", Type.ACOUSTIC,4, Wood.BRAZILIAN_ROSEWOOD,
				Wood.ADIRONDACK));
		inventory.addGuitar("106", 1799, new InstrumentSpec(Builder.OLSON, "Model-5", Type.ACOUSTIC,6, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		inventory.addGuitar("107", 9999, new InstrumentSpec(Builder.RYAN, "Model-6", Type.ACOUSTIC,5, Wood.COCOBOLD, Wood.CEDAR));

	}

}
