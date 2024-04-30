package com.fiserv.payment360.model;

import java.io.Serializable;

/**
 * 
 */

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer paymentId;
	private String senderName;
	private String recipientName;
	private String amount;
	private String paymentStatus;
	// If payment_due_date <=7 days, set as true else, false
	private Boolean todoFlag;
	private Long days;
	// Bill Pay or Zelle
	private String paymentAvenue;
	// Only applicable for Zelle
	private String zelleLimit;

	public Payment() {

	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Boolean getTodoFlag() {
		return todoFlag;
	}

	public void setTodoFlag(Boolean todoFlag) {
		this.todoFlag = todoFlag;
	}

	public Long getDays() {
		return days;
	}

	public void setDays(Long days) {
		this.days = days;
	}

	public String getPaymentAvenue() {
		return paymentAvenue;
	}

	public void setPaymentAvenue(String paymentAvenue) {
		this.paymentAvenue = paymentAvenue;
	}

	public String getZelleLimit() {
		return zelleLimit;
	}

	public void setZelleLimit(String zelleLimit) {
		this.zelleLimit = zelleLimit;
	}

}
