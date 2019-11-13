package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.servicce.ContactService;
import com.techlabs.viewmodels.ContactDisplayViewModel;


public class ContactDisplayAction implements Action {
	
	public ContactDisplayAction() {
		System.out.println("ContactDisplayAction constructor");
	}
	
	@Autowired
	private ContactService contactService;
	
	private List<Contact> contactList;

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	@Override
	public String execute() {
		contactList = contactService.getContacts();
		return "success";
	}


}
