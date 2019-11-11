package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;
import com.techlabs.viewmodels.ContactAddViewModel;

public class ContactAddAction extends ActionSupport implements ModelDriven<ContactAddViewModel> {

	ContactAddViewModel contactAddViewModel;

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
			addFieldError("userName", "UserName required");
		}

		if (contactAddViewModel.getEmail().trim().equals("") || contactAddViewModel.getEmail() == null) {
			addFieldError("email", "email required");
		}

		if (contactAddViewModel.getContactNo().trim().equals("") || contactAddViewModel.getContactNo() == null) {
			addFieldError("contactNo", "contactNo required");
		}

	}

	public String addContact() {

		ContactService contactService = ContactService.getInstance();
		contactService.addContact(new Contact(contactAddViewModel.getName(), contactAddViewModel.getContactNo(),
				contactAddViewModel.getEmail()));
		return "success";
	}

}
