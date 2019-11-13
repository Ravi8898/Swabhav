package com.techlabs.servicce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepository;

	public List<Contact> getContacts() {
		return contactRepository.getContacts();

	}

	public void addContact(Contact contact) {
		contactRepository.addContact(contact);
	}

}
