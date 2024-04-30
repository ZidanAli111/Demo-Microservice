
package com.fiserv.payment360.services.impl;

import java.time.LocalDateTime;

import java.util.Optional;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fiserv.payment360.adapter.UserProfileCustomAdapter;

import com.fiserv.payment360.entity.UserProfileEntity;

import com.fiserv.payment360.exception.UserNotFoundException;

import com.fiserv.payment360.model.UserProfileResponse;

import com.fiserv.payment360.model.UserProfileUpdateReq;

import com.fiserv.payment360.repository.UserProfileRepository;

import com.fiserv.payment360.services.iface.IUserProfileService;

import com.fiserv.payment360.util.P360Constants;

@Service
public class UserProfileServiceImpl implements IUserProfileService {

	private static final Logger log = LoggerFactory.getLogger(UserProfileServiceImpl.class);

	@Autowired
	private UserProfileRepository userProfileRepo;

	@Autowired
	UserProfileCustomAdapter adapter;

	
	@Override
	public UserProfileResponse getUserProfile(Integer userId) throws Exception {

		final String METHOD = "getUserProfile() ";

		log.info(METHOD + "Entry -> userId:: " + userId);

		UserProfileResponse userProfileResponse = null;

		Optional<UserProfileEntity> userProfile = userProfileRepo.findById(userId);

		if (userProfile.isPresent()) {

			UserProfileEntity entity = userProfile.get();

			log.info(METHOD + "USER PROFILE ENTITY :: " + entity.toString());

			userProfileResponse = adapter.convertEntityToDto(entity);

		} else {

			throw new UserNotFoundException("User not found for user_id:: " + userId);
		}

		log.info(METHOD + "Exit");

		return userProfileResponse;

	}

	
	
	

	@Override

	public UserProfileResponse updateUserProfileAgreement(UserProfileUpdateReq updateReq) throws Exception {

		final String METHOD = "updateUserProfileAgreement()";

		log.info(METHOD + "Entry -> userId:: " + updateReq.toString());

		Optional<UserProfileEntity> userProfileOpt = userProfileRepo.findById(updateReq.getUserId());

		UserProfileResponse response = null;

		if (userProfileOpt.isPresent()) {

			UserProfileEntity userProfileEntity = userProfileOpt.get();

			userProfileEntity.setUserName(updateReq.getUserName());

			userProfileEntity.setFirstName(updateReq.getFirstName());

			userProfileEntity.setMiddleName(updateReq.getMiddleName());

			userProfileEntity.setLastName(updateReq.getLastName());

			userProfileEntity.setEmail(updateReq.getEmail());

			userProfileEntity.setPhone(updateReq.getPhone());

			userProfileEntity.setSmsConsent(updateReq.getSmsConsent());

			userProfileEntity.setUserConsent(updateReq.getUserConsent());

			userProfileEntity.setUpdateDate(LocalDateTime.now());

			userProfileEntity.setUpdateBy(P360Constants.UPDATED_BY);

			userProfileEntity.getUserBankAccountEntity().stream().forEach(x -> {

				if (x.getAccountId() == updateReq.getAccountId()) {

					x.setPreferred("Y");

					x.setUpdateDate(LocalDateTime.now());

					x.setUpdateBy(P360Constants.UPDATED_BY);

				}

			});

			userProfileRepo.save(userProfileEntity);

			response = adapter.convertEntityToDto(userProfileEntity);
			
		} else {
			throw new UserNotFoundException("User not found for user_id:: " + updateReq);
		}

		log.info(METHOD + "Exit");

		return response;

	}

}