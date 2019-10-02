package com.techlabs.collection.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestGenericCollection {

	public static void main(String[] args) {

		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "ABC", 50, 100));
		cart.add(new LineItem(102, "books", 3, 500));
		cart.add(new LineItem(103, "pen", 4, 20));
		cart.add("hello");

		for (LineItem i : cart) {

			System.out.println(i.getProductName());
		}
	}

}
