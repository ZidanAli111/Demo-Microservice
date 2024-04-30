package com.fiserv.payment360.model;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 */

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	@Schema(name = "accountId", description = "This is the accountid of the concerned profile", type = "Integer", example = "1")
	private Integer accountId;

	@Schema(name = "accountType", description = "This is the accounttype of the concerned profile", type = "string", example = "saving")
	private String accountType;

	@Schema(name = "accountstatus", description = "This is the accountstatus of the concerned profile", type = "string", example = "active")
	private String accountStatus;

	@Schema(name = "accountnumber", description = "This is the accountnumber of the concerned profile", type = "string", example = "576753463645767")
	private String accountNumber;

	@Schema(name = "availablebalance", description = "This is the availablebalance of the concerned profile", type = "bigdecimal", example = "1000.00")
	private String availableBalance;

	@Schema(name = "accountnickname", description = "This is the accountnickname of the concerned profile", type = "string", example = "mainchecking")
	private String accountNickname;

	@Schema(name = "preferred", description = "This is the preferred of the concerned profile", type = "string", example = "Y")
	private String preferred;

	public Account() {

	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String bigDecimal) {
		this.availableBalance = bigDecimal;
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

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", accountStatus=" + accountStatus
				+ ", accountNumber=" + accountNumber + ", availableBalance=" + availableBalance + ", accountNickname="
				+ accountNickname + ", preferred=" + preferred + "]";
	}

}
