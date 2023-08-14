package com.ecom.app.service;

import java.util.List;

import com.ecom.app.model.Order;

public interface OrderService {

	public List<Order> getOrdersOfUser(Long userId);
}
