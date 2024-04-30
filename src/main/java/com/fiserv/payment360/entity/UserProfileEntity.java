package com.fiserv.payment360.entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;


@Entity
@Table(name = "USER_PROFILE")
public class UserProfileEntity {

	public UserProfileEntity() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "ZELLE_TAG")
	private String zelleTag;

	@Column(name = "ACTIVE")
	private String active;

	@Column(name = "USER_CONSENT")
	private String userConsent;

	@Column(name = "SMS_CONSENT")
	private String smsConsent;

	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private LocalDateTime updateDate;

	@Column(name = "UPDATE_BY")
	private String updateBy;

	@OneToMany(mappedBy = "userProfileEntity", cascade = CascadeType.ALL)
	private List<UserBankAccountEntity> userBankAccountEntity;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZelleTag() {
		return zelleTag;
	}

	public void setZelleTag(String zelleTag) {
		this.zelleTag = zelleTag;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getUserConsent() {
		return userConsent;
	}

	public void setUserConsent(String userConsent) {
		this.userConsent = userConsent;
	}

	public String getSmsConsent() {
		return smsConsent;
	}

	public void setSmsConsent(String smsConsent) {
		this.smsConsent = smsConsent;
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

	public List<UserBankAccountEntity> getUserBankAccountEntity() {
		return userBankAccountEntity;
	}

	public void setUserBankAccountEntity(List<UserBankAccountEntity> userBankAccountEntity) {
		this.userBankAccountEntity = userBankAccountEntity;
	}

	public UserProfileEntity(Integer userId, String userName, String firstName, String middleName, String lastName,
			String email, String phone, String zelleTag, String active, String userConsent, String smsConsent,
			LocalDateTime createdDate, String createdBy, LocalDateTime updateDate, String updateBy,
			List<UserBankAccountEntity> userBankAccountEntity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.zelleTag = zelleTag;
		this.active = active;
		this.userConsent = userConsent;
		this.smsConsent = smsConsent;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.userBankAccountEntity = userBankAccountEntity;
	}

	@Override
	public String toString() {
		return "UserProfileEntity [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName
				+ ", MiddleName=" + middleName + ", LastName=" + lastName + ", Email=" + email + ", Phone=" + phone
				+ ", ZelleTag=" + zelleTag + ", Active=" + active + ", UserConsent=" + userConsent + ", SmsConsent="
				+ smsConsent + ", CreatedDate=" + createdDate + ", CreatedBy=" + createdBy + ", UpdateDate="
				+ updateDate + ", UpdateBy=" + updateBy + "]";
	}

}