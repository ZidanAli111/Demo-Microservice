package com.fiserv.payment360.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;



@Entity
@Table(name = "PAYMENT_STATUS")
public class PaymentStatusEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAYMENT_STATUS_ID")
	private Integer paymentStatusId;

	@Column(name = "PAYMENT_STATUS")
	private String paymentStatus;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "UPDATED_DATE")
	private LocalDateTime updateDate;

	public PaymentStatusEntity() {

	}

	/**
	 * @param paymentStatusId
	 * @param paymentStatus
	 * @param createdDate
	 * @param amount
	 * @param updateDate
	 * @param updatedBy
	 */
	public PaymentStatusEntity(Integer paymentStatusId, String paymentStatus, LocalDateTime createdDate,
			String createdBy, LocalDateTime updateDate, String updatedBy) {
		super();
		this.paymentStatusId = paymentStatusId;
		this.paymentStatus = paymentStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updatedBy = updatedBy;
	}

	public Integer getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(Integer paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

}
