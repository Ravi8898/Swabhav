package com.techlabs.shopping.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.Customer;
import com.techlabs.shopping.Order;

class CustomerTest {

	@Test
	void testAddOrder() {

		Customer c1=new Customer(101, "Ravi");
//		List<Order> orders = new ArrayList<Order>();
		c1.addOrder(new Order(101, "01/01/2019"));
		c1.addOrder(new Order(102, "01/02/2019"));
		assertEquals(2,c1.getOrderCount());
	}

	@Test
	void testGetOrderCount() {

		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(101, "01/01/2019"));
		assertEquals(1, orders.size());
	}

}
