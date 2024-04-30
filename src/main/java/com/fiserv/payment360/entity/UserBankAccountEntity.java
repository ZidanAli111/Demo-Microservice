package com.fiserv.payment360.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "USER_BANK_ACCOUNT")
public class UserBankAccountEntity {

	public UserBankAccountEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCOUNT_ID")
	private Integer accountId;

	@Column(name = "ACCOUNT_TYPE_ID")
	private Integer accountTypeId;

	@Column(name = "ACCOUNT_STATUS_ID")
	private Integer accountStatusId;

	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "AVAILABLE_BALANCE")
	private BigDecimal availableBalance;

	@Column(name = "ACCOUNT_NICKNAME")
	private String accountNickname;

	@Column(name = "PREFERRED")
	private String preferred;

	@Column(name = "CREATED_DATE")
	private LocalDateTime CreatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private UserProfileEntity userProfileEntity;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(Integer accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public Integer getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(Integer accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getAccountNickname() {
		return accountNickname;
	}

	public void setAccountNickname(String accountNickname) {
		this.accountNickname = accountNickname;
	}

	public String getPreferred() {
		return preferred;
	}

	public void setPreferred(String preferred) {
		this.preferred = preferred;
	}

	public LocalDateTime getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		CreatedDate = createdDate;
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

	public UserProfileEntity getUserProfileEntity() {
		return userProfileEntity;
	}

	public void setUserProfileEntity(UserProfileEntity userProfileEntity) {
		this.userProfileEntity = userProfileEntity;
	}

	public UserBankAccountEntity(Integer accountId, Integer accountTypeId, Integer accountStatusId,
			String accountNumber, BigDecimal availableBalance, String accountNickname, String preferred,
			LocalDateTime createdDate, String createdBy, LocalDateTime updateDate, String updateBy,
			UserProfileEntity userProfileEntity) {
		super();
		this.accountId = accountId;
		this.accountTypeId = accountTypeId;
		this.accountStatusId = accountStatusId;
		this.accountNumber = accountNumber;
		this.availableBalance = availableBalance;
		this.accountNickname = accountNickname;
		this.preferred = preferred;
		CreatedDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.userProfileEntity = userProfileEntity;
	}

	@Override
	public String toString() {
		return "UserBankAccountEntity [accountId=" + accountId + ", accountTypeId=" + accountTypeId
				+ ", accountStatusId=" + accountStatusId + ", accountNumber=" + accountNumber + ", availableBalance="
				+ availableBalance + ", accountNickname=" + accountNickname + ", preferred=" + preferred
				+ ", CreatedDate=" + CreatedDate + ", CreatedBy=" + createdBy + ", UpdateDate=" + updateDate
				+ ", UpdateBy=" + updateBy + ", userProfileEntity=" + userProfileEntity + "]";
	}

}
