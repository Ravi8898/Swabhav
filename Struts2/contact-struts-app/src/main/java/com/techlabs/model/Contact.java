package com.techlabs.model;

import java.util.UUID;

public class Contact  {
	
	private String name;
	private String contactNo;
	private String email;
	private UUID uuid;
	
	public Contact(String name, String contactNo, String email){
		this.name=name;
		this.contactNo=contactNo;
		this.email=email;
		uuid=UUID.randomUUID();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public UUID getUuid() {
		return uuid;
	}
	
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
	
	

}
