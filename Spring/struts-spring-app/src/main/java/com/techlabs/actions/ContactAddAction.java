package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.servicce.ContactService;
import com.techlabs.viewmodels.ContactAddViewModel;

public class ContactAddAction extends ActionSupport implements ModelDriven<ContactAddViewModel> {

	ContactAddViewModel contactAddViewModel;
	
	@Autowired
	private ContactService contactService;

	private List<Contact> contactList;

	@Override
	public ContactAddViewModel getModel() {
		contactAddViewModel = new ContactAddViewModel();
		return contactAddViewModel;
	}
	

	@Override
	public String execute() {
		System.out.println("Inside Add_contact execute");
		
		return SUCCESS;
	}

	@Override
	public void validate() {
		System.out.println("Inside validate");
		if (contactAddViewModel.getName().trim().equals("") || contactAddViewModel.getName() == null) {
			addFieldError("name", "UserName required");
		}

		if (contactAddViewModel.getEmail().trim().equals("") || contactAddViewModel.getEmail() == null) {
			addFieldError("email", "email required");
		}

		if (contactAddViewModel.getContactNo().trim().equals("") || contactAddViewModel.getContactNo() == null) {
			addFieldError("contactNo", "contactNo required");
		}

	}

	public String addContact() {

		System.out.println("Inside addContact");
		contactService.addContact(new Contact(contactAddViewModel.getName(), contactAddViewModel.getContactNo(),
				contactAddViewModel.getEmail()));
		contactList=contactService.getContacts();
		return "success";
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

}
