package com.techlabs.shopping.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;

class OrderTest {
	
	@Test
	void testOrder() {
		Order order=new Order(301, "01/01/2019");
		assertEquals(301,order.getId());
		assertEquals("01/01/2019",order.getDate());
	}
	@Test
	void testAdd() {

	List items=new ArrayList();
	items.add(new LineItem(201, 10, new Product(101, "book", 100, 20)));
	assertEquals(1, items.size());
	}

	@Test
	void testGetItemCount() {
		List items=new ArrayList();
		items.add(new LineItem(201, 10, new Product(101, "book", 100, 20)));
		items.add(new LineItem(202, 10, new Product(102, "pen", 20, 50)));
		assertEquals(2, items.size());
	}

}
