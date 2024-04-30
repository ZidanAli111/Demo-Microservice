

package com.fiserv.payment360.model;


import java.io.Serializable;

import java.util.List;

 

import io.swagger.v3.oas.annotations.media.Schema;

 

@Schema(name = "UserProfileResponse", description = "This transfer object is used to capture the User Profile details.")

public class UserProfileResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "userId", description = "This is the userid of the concerned profile", type = "Integer", example = "1")

    private Integer userId;

 

    @Schema(name = "userName", description = "This is the username of the concerned profile", type = "String", example = "john123")

    private String userName;

 

    @Schema(name = "firstName", description = "This is the firstname of the concerned profile", type = "String", example = "john")

    private String firstName;

 

    @Schema(name = "middleName", description = "This is the middlename of the concerned profile", type = "String", example = "kumar")

    private String middleName;

 

    @Schema(name = "lastName", description = "This is the lastname of the concerned profile", type = "String", example = "doe")

    private String lastName;

 

    @Schema(name = "email", description = "This is the email of the concerned profile", type = "String", example = "john@gmail.com")

    private String email;


    @Schema(name = "phone", description = "This is the user phone of the concerned profile", type = "Integer", example = "6754364534")
    private String phone;

    @Schema(name = "zelleTag", description = "This is the zelletag of the concerned profile", type = "String", example = "xderr")

    private String zelleTag;

 

    @Schema(name = "active", description = "This is the active of the concerned profile", type = "String", example = "Y")

    private String active;

    @Schema(name = "userConsent", description = "This is the userconsent of the concerned profile", type = "String", example = "Y")

    private String userConsent;

    @Schema(name = "smsConsent", description = "This is the smsconsent of the concerned profile", type = "String", example = "Y")

    private String smsConsent;

    private List<Account> accounts;

 

    public UserProfileResponse() {

 

    }

 

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

 

    public List<Account> getAccounts() {

        return accounts;

    }

 

    public void setAccounts(List<Account> accounts) {

        this.accounts = accounts;

    }

 

    @Override

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("UserProfileResponse [userId=");

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

        builder.append(", zelleTag=");

        builder.append(zelleTag);

        builder.append(", active=");

        builder.append(active);

        builder.append(", userConsent=");

        builder.append(userConsent);

        builder.append(", smsConsent=");

        builder.append(smsConsent);

        builder.append(", accounts=");

        builder.append(accounts);

        builder.append("]");

        return builder.toString();

    }

 

}
