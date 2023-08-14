package com.ecom.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.app.model.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> userLst = List.of(
			new User(101L, "Satish Bharose", "7588155165"),
			new User(102L, "Mahesh Joshi", "1234567890"), 
			new User(103L, "Rajesh Pandhare", "1122334455"));

	@Override
	public User getUserById(Long id) {
		return userLst.stream()
				.filter(user -> user.getUserId().equals(id))
				.findAny()
				.orElse(null);
	}

}
