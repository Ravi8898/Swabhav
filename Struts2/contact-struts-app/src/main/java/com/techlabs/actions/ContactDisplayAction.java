package com.techlabs.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;
import com.techlabs.viewmodels.ContactDisplayViewModel;

public class ContactDisplayAction extends ActionSupport implements ModelDriven<ContactDisplayViewModel> {

	private ContactDisplayViewModel contactDisplayViewModel;
	private ContactService contactService=ContactService.getInstance();
	private List<Contact> contactList=contactService.get();
	
	@Override
	public ContactDisplayViewModel getModel() {
		contactDisplayViewModel=new ContactDisplayViewModel();
		return contactDisplayViewModel;
	}
	
	public List<Contact> getContactList() {
		return contactList;
	}
	
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
	@Override
	public String execute() {
		
//		contactList=contactService.get();
//		System.out.println(contactList);
		return "success";
	}

}
