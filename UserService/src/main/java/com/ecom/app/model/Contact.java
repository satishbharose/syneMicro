package com.ecom.app.model;

import lombok.Data;

//@Data
public class Contact {

	private long cId;
	private String email;
	private String contactName;
	private long user;
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
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
	public long getUser() {
		return user;
	}
	public void setUser(long user) {
		this.user = user;
	}

}
