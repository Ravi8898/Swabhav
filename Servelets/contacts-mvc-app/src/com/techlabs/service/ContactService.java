package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {

	private static ContactService instance;
	
	ContactRepository contactRepository=new ContactRepository();

	Contact contact1 = new Contact("Ravi", "Maurya", 8898, "ravi@gmail.com");
	Contact contact2 = new Contact("Nilam", "Menat", 9137, "nilam@gmail.com");
	Contact contact3 = new Contact("Sunny", "Maurya", 9768, "sunny@gmail.com");

	public static ContactService getInstance() {
		if (instance == null)
			instance = new ContactService();
		return instance;
	}

	private ContactService() {
		System.out.println("this is service");

		contactRepository.add(contact1);
		contactRepository.add(contact2);
		contactRepository.add(contact3);
		

	}

	public List<Contact> get() {
		return contactRepository.get();
	}

	public void add(Contact contact) {
		contactRepository.add(contact);
		
//		contactList.add(contact);
//		System.out.println(contactList.size());
	}
}
