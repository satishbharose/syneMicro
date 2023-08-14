package com.ecom.app.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ecom.app.model.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	List<Order> orderLst = List.of(
			new Order(111L, "1010", new Date(), "iPhone", 101L),
			new Order(112L, "1011", new Date(), "Samsung", 101L),
			new Order(113L, "1012", new Date(), "1Plus", 102L));

	@Override
	public List<Order> getOrdersOfUser(Long userId) {
		return orderLst.stream()
				.filter(order -> order.getUser() == userId)
				.collect(Collectors.toList());
	}

}
