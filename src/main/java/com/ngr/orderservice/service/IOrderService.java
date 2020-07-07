package com.ngr.orderservice.service;

import org.springframework.stereotype.Service;

import com.ngr.orderservice.model.OrderDetial;

@Service
public interface IOrderService {

	public OrderDetial getOrderDetail();
}
