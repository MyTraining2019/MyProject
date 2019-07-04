package org.cap.order;

import java.time.LocalDate;

public class ConfirmOrders {
	private int orderNo;
	private LocalDate confirmDate;
	private LocalDate expectedDeliveryDate;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDate getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(LocalDate confirmDate) {
		this.confirmDate = confirmDate;
	}
	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	@Override
	public String toString() {
		return "ConfirmOrders [orderNo=" + orderNo + ", confirmDate=" + confirmDate + ", expectedDeliveryDate="
				+ expectedDeliveryDate + "]";
	}
	
	

}
