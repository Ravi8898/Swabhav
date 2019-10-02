package com.techlabs.contact;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.contact.Contact;

public class ContactSaver {

	public void saveContact() {

		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact contact1 = new Contact();
		System.out.println("Total no of Contacts:" + contactList.size());
		enterDetails(contact1, contactList);
		printContactDetail(contactList);
	}

	public void enterDetails(Contact contact, ArrayList<Contact> contactList) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Mobile no.");
		String mobileNo = scanner.nextLine();
		contact.setContactNo(mobileNo);

		System.out.println("Enter Name");
		String name = scanner.nextLine();
		contact.setName(name);

		System.out.println("Enter e-mail");
		String email = scanner.nextLine();
		contact.seteMail(email);
		contactList.add(contact);
		System.out.println("Total no of Contacts:" + contactList.size());
		scanner.close();
	}

	public void printContactDetail(ArrayList<Contact> contactList) {

		for (Contact contact : contactList) {
			System.out.println("Mobile No.: " + contact.getContactNo() + "\nName: " + contact.getName() + "\ne-mail: "
					+ contact.geteMail());

		}
	}
}
