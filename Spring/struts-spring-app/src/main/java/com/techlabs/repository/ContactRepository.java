package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Contact;

@Repository
public class ContactRepository {

	private List<Contact> contactList;
	Contact contact1 = new Contact("Ravi", "8898356801", "ravi@maurya");

	Contact contact2 = new Contact("Sunny", "8169203773", "sunny@maurya");
	Contact contact3 = new Contact("Akash", "7542136849", "akash@gupta");

	public ContactRepository() {
		System.out.println("this is repository");
		contactList = new ArrayList<Contact>();
		contactList.add(contact1);
		
		contactList.add(contact2);
		contactList.add(contact3);
		
		System.out.println(contactList);
	}
	
	public List<Contact> getContacts(){
		return contactList;
	}
	
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
}

