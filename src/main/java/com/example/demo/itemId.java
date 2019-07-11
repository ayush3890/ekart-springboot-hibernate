package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

public class itemId {
	private order Order;

	public itemId() {
	}

	public itemId(order userId) {
		this.Order = userId;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) {
			return true;
		}
		if (!(o instanceof item)) {
			return false;
		}
		item assignedRole = (item) o;
		return Objects.equals(Order, assignedRole.getOrderID());
	}

	@Override
	public int hashCode() {
		return Objects.hash(Order.getOrderId());
	}
}