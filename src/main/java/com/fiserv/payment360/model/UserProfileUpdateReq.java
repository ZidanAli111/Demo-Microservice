
package com.fiserv.payment360.model;

import java.io.Serializable;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import io.swagger.v3.oas.annotations.media.Schema;

public class UserProfileUpdateReq implements Serializable {

	private static final long serialVersionUID = 1L;

	@Schema(name = "userId", description = "UserId of profile", type = "Integer", minimum = "1", maximum = "10", example = "01")

	@NotBlank(message = "The associate Id is required.")

	@Size(min = 1, max = 10, message = "The length of userId Id must be between 5 and 30 characters")

	private Integer userId;

	@Schema(name = "accountId", description = "AccountId of profile", type = "Integer", minimum = "1", maximum = "10", example = "01")

	@NotBlank(message = "The associate Id is required.")

	@Size(min = 1, max = 10, message = "The length of account Id must be between 1 and 10 characters")

	private Integer accountId;

	@Schema(name = "userconsent", description = "userconsent of profile", type = "String", minimum = "1", maximum = "5", example = "Y")

	@NotBlank(message = "The userconsent is required.")

	@Size(min = 1, max = 5, message = "The length of userconsent must be between 1 and 5 characters")

	private String userConsent;

	@Schema(name = "smsconsent", description = "smsconsent of profile", type = "String", minimum = "1", maximum = "5", example = "Y")

	@NotBlank(message = "The smsconsent is required.")

	@Size(min = 1, max = 5, message = "The length of smsconsent must be between 1 and 5 characters")

	private String smsConsent;

	@Schema(name = "preferred", description = "userconsent of profile", type = "String", minimum = "1", maximum = "5", example = "Y")

	@NotBlank(message = "The preferred is required.")

	@Size(min = 1, max = 5, message = "The length of preferred must be between 1 and 5 characters")

	private String preferred;

	@Schema(name = "firstName", description = "firstname of user", type = "String", minimum = "4", maximum = "25", example = "Aditi")

	@NotBlank(message = "The firstname is required.")

	@Size(min = 4, max = 25, message = "The length of preferred must be between 4 and 25 characters")

	private String firstName;

	@Schema(name = "MiddleName", description = "MiddleName of user", type = "String", minimum = "4", maximum = "25", example = "parmar")

	@NotBlank(message = "The MiddleName is required.")

	@Size(min = 4, max = 25, message = "The length of preferred must be between 4 and 25 characters")

	private String middleName;

	@Schema(name = "lastName", description = "lastName of user", type = "String", minimum = "4", maximum = "25", example = "parmar")

	@NotBlank(message = "The lastName is required.")

	@Size(min = 4, max = 25, message = "The length of preferred must be between 4 and 25 characters")

	private String lastName;

	@Schema(name = "userName", description = "userName of user", type = "String", minimum = "4", maximum = "25", example = "parmar123")

	@NotBlank(message = "The userName is required.")

	@Size(min = 4, max = 25, message = "The length of preferred must be between 4 and 25 characters")

	private String userName;

	@Schema(name = "email", description = "email of user", type = "String", minimum = "4", maximum = "30", example = "parmar@gmail.com")

	@NotBlank(message = "The email is required.")

	@Size(min = 4, max = 25, message = "The length of preferred must be between 4 and 25 characters")

	private String email;

	@Schema(name = "phone", description = "phone of user", type = "String", minimum = "4", maximum = "25", example = "parmar")

	@NotBlank(message = "The phone is required.")

	@Size(min = 4, max = 25, message = "The length of phone must be between 4 and 25 characters")

	private String phone;

	public UserProfileUpdateReq() {

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

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getUserName() {

		return userName;

	}

	public void setUserName(String userName) {

		this.userName = userName;

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

	public Integer getUserId() {

		return userId;

	}

	public void setUserId(Integer userId) {

		this.userId = userId;

	}

	public Integer getAccountId() {

		return accountId;

	}

	public void setAccountId(Integer accountId) {

		this.accountId = accountId;

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

	public String getPreferred() {

		return preferred;

	}

	public void setPreferred(String preferred) {

		this.preferred = preferred;

	}

	@Override

	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("UserProfileUpdateReq [userId=");

		builder.append(userId);

		builder.append(", userName=");

		builder.append(userName);

		builder.append(", firstName=");

		builder.append(firstName);

		builder.append(", middleName=");

		builder.append(middleName);

		builder.append(", lastName=");

		builder.append(lastName);

		builder.append(", email=");

		builder.append(email);

		builder.append(", phone=");

		builder.append(phone);

		builder.append(", accountId=");

		builder.append(accountId);

		builder.append(", userConsent=");

		builder.append(userConsent);

		builder.append(", smsConsent=");

		builder.append(smsConsent);

		builder.append(", preferred=");

		builder.append(preferred);

		builder.append("]");

		return builder.toString();

	}

}
