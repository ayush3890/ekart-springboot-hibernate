package com.example.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
@IdClass(item.class)
public class item implements Serializable{

	@Id
	private String ItemId;

	// @ManyToOne(targetEntity = order.class)

	@ManyToOne(targetEntity = order.class)
	@JoinColumn(name = "OrderId")
	private order Order;

	private String ProductID;
	private int QtyRequired;
	private int QtyDispatched;

	private ArrayList<UUID> InvoiceIds;

	public item(String productID, int qtyRequired, int qtyDispatched) {
		super();
		ProductID = productID;
		QtyRequired = qtyRequired;
		QtyDispatched = qtyDispatched;

	}

	public String getItemId() {
		return ItemId;
	}

	public void setItemId(String itemId) {
		ItemId = itemId;
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}

	public int getQtyRequired() {
		return QtyRequired;
	}

	public void setQtyRequired(int qtyRequired) {
		QtyRequired = qtyRequired;
	}

	public int getQtyDispatched() {
		return QtyDispatched;
	}

	public void setQtyDispatched() {
		QtyDispatched = 0;
	}

	public ArrayList<UUID> getInvoiceIds() {
		return InvoiceIds;
	}

	public void setInvoiceIds() {
		InvoiceIds = new ArrayList<UUID>();
	}

	public order getOrderID() {
		return Order;
	}

	public void setOrderID(order orderID) {
		Order = orderID;
	}

	@Override
	public String toString() {
		return "Item [OrderID=" + Order + ", ProductID=" + ProductID + ", QtyRequired=" + QtyRequired
				+ ", QtyDispatched=" + QtyDispatched + ", InvoiceIds=" + InvoiceIds + "]";
	}

}
