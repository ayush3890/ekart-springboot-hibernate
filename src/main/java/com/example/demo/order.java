package com.example.demo;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "order")
public class order {
	@Id
	private String OrderId;
	private String OrderUserId;
	private String OrderSellerId;
	private float OrderAmount;

	private String OrderEmail;
	private Timestamp OrderDate;
	private String OrderStatus;
	private String OrderTrackingNumber;

	@OneToMany(mappedBy = "Order")
	private Set<item> OrtderItems;

	public String getOrderId() {
		return OrderId;
	}

	public void setOrderId() {
		OrderId = UUID.randomUUID().toString();
	}

	public void setOrderId(String orderID) {
		OrderId = orderID;
	}

	public String getOrderUserId() {
		return OrderUserId;
	}

	public void setOrderUserId(String orderUserId) {
		OrderUserId = orderUserId;
	}

	public float getOrderAmount() {
		return OrderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		OrderAmount = orderAmount;
	}

	public String getOrderEmail() {
		return OrderEmail;
	}

	public void setOrderEmail(String orderEmail) {
		OrderEmail = orderEmail;
	}

	public Timestamp getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate() {
		OrderDate = new Timestamp(System.currentTimeMillis());
	}

	public void setOrderDate(String time) {
		OrderDate = Timestamp.valueOf(time);
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	public String getOrderTrackingNumber() {
		return OrderTrackingNumber;
	}

	public void setOrderTrackingNumber(String orderTrackingNumber) {
		OrderTrackingNumber = orderTrackingNumber;
	}

	public Set<item> getOrtderItems() {
		return OrtderItems;
	}

	public void setOrtderItems(Set<item> ortderItems) {
		OrtderItems = ortderItems;
	}

	public String getOrderSellerId() {
		return OrderSellerId;
	}

	public void setOrderSellerId(String orderSellerId) {
		OrderSellerId = orderSellerId;
	}

	@Override
	public String toString() {
		return "order [OrderId=" + OrderId + ", OrderUserId=" + OrderUserId + ", OrderSellerId=" + OrderSellerId
				+ ", OrderAmount=" + OrderAmount + ", OrderEmail=" + OrderEmail + ", OrderDate=" + OrderDate
				+ ", OrderStatus=" + OrderStatus + ", OrderTrackingNumber=" + OrderTrackingNumber + ", OrtderItems="
				+ OrtderItems + "]";
	}
}
