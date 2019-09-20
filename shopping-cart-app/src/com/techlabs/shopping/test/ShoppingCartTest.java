package com.techlabs.shopping.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import com.techlabs.shopping.Customer;
import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;

public class ShoppingCartTest {

	public static void main(String[] args) throws FileNotFoundException {

//		OutputStream os = new FileOutputStream("/shopping-cart-app/Resources/invoice.html");
//		PrintStream out = new PrintStream(os);
		
		Product product1 = new Product(401, "Book", 100, 20);
		Product product2 = new Product(402, "Pen", 50, 10);
		Product product3 = new Product(403, "Shoes", 1000, 30);

		Product product4 = new Product(404, "Laptop", 50000, 25);
		Product product5 = new Product(405, "Mobile Phone", 4000, 15);

		LineItem lineItem1 = new LineItem(301, 3, product1);
		LineItem lineItem2 = new LineItem(303, 4, product2);
		LineItem lineItem3 = new LineItem(303, 2, product3);

		LineItem lineItem4 = new LineItem(304, 2, product4);
		LineItem lineItem5 = new LineItem(305, 3, product5);

		Order order1 = new Order(201, "01/01/2019");
		order1.add(lineItem1);
		order1.add(lineItem2);
		order1.add(lineItem3);
		Order order2 = new Order(202, "01/02/2019");
		order2.add(lineItem4);
		order2.add(lineItem5);

		Customer c1 = new Customer(101, "Ravi");
		c1.addOrder(order1);
		c1.addOrder(order2);

		printInfo(c1);
	}

	public static void printInfo(Customer c) {

		System.out.println("Hello " + c.getName() + ",\n" + "  Your Order details are: \n    ");
		double totalCost = 0;
		double totalOrderCost = 0;
		for (Iterator i = c.getOrders().iterator(); i.hasNext();) {

			Order order = (Order) i.next();

			System.out.print("  OrderID: " + order.getId() + " date: " + order.getDate());

			for (Iterator j = order.getItems().iterator(); j.hasNext();) {

				LineItem lineItem = (LineItem) j.next();

				System.out.println("\n    ProductName:" + lineItem.getProduct().getName() + " Price: "
						+ lineItem.getProduct().getPrice() + " Quantity:" + lineItem.getQuantity() + "\n      Amount: "
						+ lineItem.getProduct().calculateProductCost() + " Discount on Product: "
						+ lineItem.getProduct().getDiscountPercentage() + " Total Product Cost:"
						+ lineItem.calculateItemCost() + "\n");
				totalCost = totalCost + lineItem.calculateItemCost();
			}
			System.out.println("Total amount of order:" + totalCost);
			System.out.println();
			totalOrderCost = totalOrderCost + totalCost;

		}

		System.out.println("Total amount of All orders:" + totalOrderCost);

	}

}