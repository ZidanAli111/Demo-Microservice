package com.fiserv.payment360.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "PAYMENT_DETAILS")
public class PaymentDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAYMENT_ID")
	private Integer paymentId;

	@Column(name = "SENDER_ID")
	private Integer senderId;

	@Column(name = "RECIPIENT_ID")
	private Integer recipientId;

	@Column(name = "AMOUNT")
	private BigDecimal amount;

	@Column(name = "PAYMENT_DUE_DATE")
	private LocalDateTime payeeDueDate;

	@Column(name = "PAYMENT_STATUS_ID")
	private Integer paymentStatusId;

	@Column(name = "MEMO")
	private String memo;

	@Column(name = "PAYMENT_CHANNEL")
	private String paymentChannel;

	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;

	public PaymentDetailsEntity() {

	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getSenderId() {
		return senderId;
	}

	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}

	public Integer getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(Integer recipientId) {
		this.recipientId = recipientId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getPayeeDueDate() {
		return payeeDueDate;
	}

	public void setPayeeDueDate(LocalDateTime payeeDueDate) {
		this.payeeDueDate = payeeDueDate;
	}

	public Integer getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(Integer paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPaymentChannel() {
		return paymentChannel;
	}

	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * @param paymentId
	 * @param senderId
	 * @param recipientId
	 * @param amount
	 * @param payeeDueDate
	 * @param paymentStatusId
	 * @param memo
	 * @param paymentChannel
	 * @param createdDate
	 * @param createdBy
	 * @param updateDate
	 * @param updateBy
	 */
	public PaymentDetailsEntity(Integer paymentId, Integer senderId, Integer recipientId, BigDecimal amount,
			LocalDateTime payeeDueDate, Integer paymentStatusId, String memo, String paymentChannel,
			LocalDateTime createdDate, String createdBy, LocalDateTime updateDate, String updateBy) {
		super();
		this.paymentId = paymentId;
		this.senderId = senderId;
		this.recipientId = recipientId;
		this.amount = amount;
		this.payeeDueDate = payeeDueDate;
		this.paymentStatusId = paymentStatusId;
		this.memo = memo;
		this.paymentChannel = paymentChannel;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
	}

}
