package com.ecom.app.service;

import java.util.List;

import com.ecom.app.model.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
}
