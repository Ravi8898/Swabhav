package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1=new Customer("Ravi", "Maurya");
		Customer c2=new Customer("abc", "pqr");
		Customer c3=new Customer("cde", "lmn");
		printInfo(c1);
		printInfo(c2);
		printInfo(c3);
	}
	
	public static void printInfo(Customer c){
		
		System.out.print(c.getFirstName()+" ");
		System.out.print(c.getLastName()+" ");
		System.out.println(c.getCustomerID());
	}

}
