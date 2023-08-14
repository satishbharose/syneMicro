package com.ecom.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ecom.app.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contactLst = List.of(
			new Contact(1L, "satishcontact@gmail.com", "Satish B Contact", 101L),
			new Contact(2L, "bharosecontact@gmail.com", "Bharose B Contact", 101L),
			new Contact(3L, "dardecontact@gmail.com", "Darde P Contact", 102L));
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return contactLst.stream()
				.filter(contact -> contact.getUser() == userId)
				.collect(Collectors.toList());
	}

}
