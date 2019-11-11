package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {

	private static ContactService instance;
	private List<Contact> contactList;

	Contact contact1 = new Contact("Ravi", "8898356801", "ravi@maurya");
	Contact contact2 = new Contact("Sunny", "8169203773", "sunny@maurya");
	Contact contact3 = new Contact("Akash", "7542136849", "akash@gupta");

	public static ContactService getInstance() {
		if (instance == null)
			instance = new ContactService();
		return instance;
	}

	private ContactService() {
		System.out.println("this is service");
		contactList=new ArrayList<Contact>();
		
		contactList.add(contact1);
		contactList.add(contact2);
		
		contactList.add(contact3);
		System.out.println(contactList);

	}

	public List<Contact> get() {
		return contactList;

	}

	public void addContact(Contact contact) {
		contactList.add(contact);
	}

}
