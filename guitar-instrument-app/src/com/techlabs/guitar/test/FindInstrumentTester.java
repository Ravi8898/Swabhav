package com.techlabs.guitar.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.management.modelmbean.ModelMBean;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Instrument;
import com.techlabs.guitar.InstrumentSpec;
import com.techlabs.guitar.InstrumentType;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class FindInstrumentTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.COLLINGS);
		properties.put("backwood", Wood.SITKA);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstrument = inventory.search(clientSpec);
		if (!matchingInstrument.isEmpty()) {
			System.out.println("Erin, you might like this instruments: ");
			for (Iterator i = matchingInstrument.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("We have a " + spec.getProperty("instrumentType") + " with following property:");

				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {

					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + ": " + spec.getProperty(propertyName));
				}

				System.out.println(
						" You can have this " + spec.getProperty("instrumentType") + " for $ " + instrument.getPrice());
			}

		} else {
			System.out.println("Sorry, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {

		Map properties = new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numStrings", 6);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD);
		properties.put("backWood", Wood.SITKA);
		inventory.addInstrument("11227", 3999.95, new InstrumentSpec(properties));

//		properties.put("builder", Builder.MARTIN);
//		properties.put("model", "Stratocaster");
//		properties.put("type", Type.ELECTRIC);
//		properties.put("topWood", Wood.ALDER);
//		properties.put("backWood", Wood.ALDER);
//		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
//		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
//
//		
//		properties.put("builder", Builder.GIBSON);
//		properties.put("model", "Les Paul");
//		properties.put("numStrings", 6);
//		properties.put("topWood", Wood.MAPLE);
//		properties.put("backWood", Wood.MAPLE);
//		inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));
//		
//		properties.put("model", "SG '61 Reissue");
//		properties.put("topWood", Wood.MAHOGANY);
//		properties.put("backWood", Wood.MAHOGANY);
//		inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));
//		
//
//		properties.put("instrumentType", InstrumentType.MANDOLIN);
//		properties.put("type", Type.ACOUSTIC);
//		properties.put("model", "F-5G");
//		properties.put("topWood", Wood.MAPLE);
//		properties.put("backWood", Wood.MAPLE);
//		properties.remove("numStrings");
//		inventory.addInstrument("9019920", 5495.95, new InstrumentSpec(properties));
//		
//		properties.put("instrumentType", InstrumentType.BANJO);
//		properties.put("model", "RB-3 Wreath");
//		properties.put("numStrings", 5);
//		properties.remove("topWood");
//		properties.put("backWood", Wood.SITKA);
//		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	}

}
