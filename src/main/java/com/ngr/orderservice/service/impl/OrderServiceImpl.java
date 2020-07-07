package com.ngr.orderservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ngr.orderservice.model.OrderDetial;
import com.ngr.orderservice.model.OrderDetial.Order;
import com.ngr.orderservice.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	@Override
	public OrderDetial getOrderDetail() {
		Order order1 = new Order(1, 250, "12-Apr-2020");
		Order order2 = new Order(2, 450, "15-Apr-2020");
		
		List<Order> orders = new ArrayList<OrderDetial.Order>();
		orders.add(order1);
		orders.add(order2);
		
		OrderDetial orderDetail = new OrderDetial();
		orderDetail.setOrders(orders);
		
		return orderDetail;
	}

}
