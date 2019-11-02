package com.techlabs.statement;

import java.util.List;

public class RepositoryTest {

	public static void main(String[] args) {
		
		ContactRepository contactRepo=new ContactRepository();
		List<Contact> contacts=contactRepo.get();
		System.out.println(contacts.size());
		System.out.println(contacts.get(0).getName());
		contactRepo.add(new Contact("abc","xyz",8898,"abc@xyz"));
		
	}

}
