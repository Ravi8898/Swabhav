package com.techlabs.service;

import java.util.List;
import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {

	private static ContactService instance;
	ContactRepository contactRepository = new ContactRepository();

	public static ContactService getInstance() {
		if (instance == null)
			instance = new ContactService();
		return instance;
	}

	private ContactService() {
		System.out.println("this is service");

	}

	public List<Contact> get() {
		return contactRepository.get();
	}

	public void add(Contact contact) {
		contactRepository.add(contact);
	}

	public Contact get(int contactId) {
		return contactRepository.get(contactId);
	}

	public void edit(int contactId, Contact contact) {
		contactRepository.edit(contactId, contact);
	}

	public void remove(int contactId) {
		contactRepository.remove(contactId);
		
	}
}