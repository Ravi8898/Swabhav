package com.techlabs.shopping.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.Product;

class ProductTest {

	@Test
	void testCalculateProductCost() {

		Product product = new Product(101, "Book", 100, 20);
		assertEquals(80, product.calculateProductCost());
	}

}
