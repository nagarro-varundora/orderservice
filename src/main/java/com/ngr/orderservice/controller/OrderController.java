package com.ngr.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ngr.orderservice.model.OrderDetial;
import com.ngr.orderservice.service.impl.OrderServiceImpl;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	OrderServiceImpl orderService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<OrderDetial> getOrderDetail(@PathVariable("id") int orderId) {
		return ResponseEntity.ok(orderService.getOrderDetail());
	}

}
