package com.techlabs.shopping.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Product;

class LineItemTest {

	@Test
	void testCalculateItemCost() {

	LineItem lineItem1=new LineItem(201, 10, new Product(101, "book", 100, 20));	
	assertEquals(800, lineItem1.calculateItemCost());
	}

}
