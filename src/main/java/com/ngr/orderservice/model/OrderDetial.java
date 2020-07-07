package com.ngr.orderservice.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetial {
	private List<Order> orders;
	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	static public class Order{
		
		@JsonProperty("orderId")
		private int id;
		
		@JsonProperty("orderAmount")
		private int amount;
		
		@JsonProperty("orderDate")
		private String date;
		
		public Order(int id, int amount, Date date){
			this.id = id;
			this.amount = amount;
			this.setDate(date);
		}
		
		public Order(int id, int amount, String dateStr)
		{
			this.id = id;
			this.amount = amount;
			this.date = dateStr;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = new SimpleDateFormat("dd-MMM-yyyy").format(date);
		}
		public void setDate(String dateStr) {
			this.date = dateStr;
		}
	}
}
