package org.cap.order;

import java.time.LocalDate;

public class OrderDetails {

	private int orderNumber;
	private String productName;
	private double price;
	private int quantity;
	private LocalDate orderDate;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderNumber=" + orderNumber + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", orderDate=" + orderDate + "]";
	}
	
	
}
