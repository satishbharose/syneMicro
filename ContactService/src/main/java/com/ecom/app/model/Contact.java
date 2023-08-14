package com.ecom.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class Contact {

	private Long cId;
	private String email;
	private String contactName;
	private Long user;
	public Contact() {
		super();
	}
	public Contact(Long cId) {
		super();
		this.cId = cId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getUser() {
		return user;
	}
	public void setUser(Long user) {
		this.user = user;
	}
	public Contact(Long cId, String email, String contactName, Long user) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.user = user;
	}
	
}