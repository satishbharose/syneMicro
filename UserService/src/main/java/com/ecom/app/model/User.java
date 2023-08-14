package com.ecom.app.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class User {

	private Long userId;
	private String name;
	private String phoneNo;
	private List<Contact> contacts;
	private List<Order> orders;
	public User() {
		super();
	}
	public User(Long id) {
		super();
		this.userId = id;
	}
	public User(Long id, String name, String phoneNo) {
		super();
		this.userId = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public User(Long id, String name, String phoneNo, List<Contact> contacts) {
		super();
		this.userId = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.contacts = contacts;
	}
	public User(Long userId, String name, String phoneNo, List<Contact> contacts, List<Order> orders) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.contacts = contacts;
		this.orders = orders;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}