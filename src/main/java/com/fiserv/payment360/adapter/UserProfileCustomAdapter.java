package com.fiserv.payment360.adapter;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fiserv.payment360.entity.UserProfileEntity;
import com.fiserv.payment360.model.Account;
import com.fiserv.payment360.model.UserProfileResponse;
import com.fiserv.payment360.util.P360Util;

@Component
public class UserProfileCustomAdapter {

	//TODO - This layer should be implemented using Model Mapper
	private static final Logger log = LoggerFactory.getLogger(UserProfileCustomAdapter.class);

	
	public UserProfileResponse convertEntityToDto(UserProfileEntity entity) throws Exception {

		final String METHOD = "convertEntityToDto";

		UserProfileResponse user = new UserProfileResponse();
		List<Account> accounts = new ArrayList<>();

		try {

			// USER_PROFILE

			// Get the values from Entity and set them in the DTO
			user.setUserId(entity.getUserId());
			user.setFirstName(entity.getFirstName());
			user.setMiddleName(entity.getMiddleName());
			user.setLastName(entity.getLastName());
			user.setActive(entity.getActive());
			user.setUserName(entity.getUserName());
			user.setEmail(entity.getEmail());
			user.setSmsConsent(entity.getSmsConsent());
			user.setUserConsent(entity.getUserConsent());
			user.setZelleTag(entity.getZelleTag());
			user.setPhone(entity.getPhone());

			// USER_BANK_ACCOUNT
			entity.getUserBankAccountEntity().stream().forEach(acct -> {

				Account userAcct = new Account();

				// Get the values from Entity and set them in the DTO
				userAcct.setAccountId(acct.getAccountId());
				userAcct.setAccountNickname(acct.getAccountNickname());
				userAcct.setAccountNumber(acct.getAccountNumber());
				userAcct.setPreferred(acct.getPreferred());
				//Fetch the status and type for account
				

				userAcct.setAvailableBalance(P360Util.convertBDToString(acct.getAvailableBalance()));

				accounts.add(userAcct);
			});

			user.setAccounts(accounts);

		} catch (Exception ex) {
			log.error(METHOD + "Exception occurred:: " + ex.getMessage());
			throw ex;
		}

		return user;

	}

}
