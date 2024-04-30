package com.fiserv.payment360.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.payment360.model.UserProfileResponse;
import com.fiserv.payment360.model.UserProfileUpdateReq;
import com.fiserv.payment360.services.impl.UserProfileServiceImpl;
import com.fiserv.payment360.util.P360Constants;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User Profiles", description = "User profile management APIs")
@RestController
public class UserProfileController {

	private static final Logger log = LoggerFactory.getLogger(UserProfileController.class);

	@Autowired
	private UserProfileServiceImpl userProfileServiceImpl;

	/**
	 * This method is used to fetch the user profile details by user Id
	 * 
	 * @param userId
	 * @return ResponseEntity<UserProfileResponse>
	 * @throws Exception
	 */

	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Retrieve a user profile by Id", description = "Get a User profile object by specifying its id."/*
																															 * ,
																															 * tags
																															 * =
																															 * {
																															 * "users",
																															 * "get"
																															 * }
																															 */)
	@ApiResponses({ @ApiResponse(responseCode = "200", content = {
			@Content(schema = @Schema(implementation = UserProfileResponse.class), mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "BAD REQUEST", content = { @Content(schema = @Schema()) }),
			@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = {
					@Content(schema = @Schema()) }) })

	@GetMapping(value = P360Constants.USER_PROFILE_DETAILS_URL, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserProfileResponse> getUserProfileById(@PathVariable("userId") Integer userId)
			throws Exception {

		final String METHOD = "getUserProfileById() ";
		log.info(METHOD + "Entry -> userId:: " + userId);
		ResponseEntity<UserProfileResponse> responseEntity = null;

		try {
			UserProfileResponse userProfileResponse = userProfileServiceImpl.getUserProfile(userId);
			if (userProfileResponse != null && userProfileResponse.getUserId() > 0) {
				responseEntity = new ResponseEntity<>(userProfileResponse, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<>(userProfileResponse, HttpStatus.NOT_FOUND);
			}

		} catch (Exception ex) {
			log.error(METHOD + "Exception occurred:: " + ex.getMessage());
			throw ex;
		}

		log.info(METHOD + "Exit");
		return responseEntity;
	}

	/**
	 * This method is used to update user agreement & account preference
	 * 
	 * @param UserProfileUpdateReq
	 * @return ResponseEntity<UserProfileResponse>
	 * @throws Exception
	 */

//			@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = {
//					@Content(schema = @Schema()) }) })
//	@PatchMapping(value = P360Constants.USER_PROFILE_UPDATE_URL, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<UserProfileResponse> updateUserProfile(@RequestBody UserProfileUpdateReq updateReq)
//			throws Exception {
//
//		final String METHOD = "updateUserProfile() ";
//		ResponseEntity<UserProfileResponse> userProfileResp = null;
//
//		try {
//			UserProfileResponse response = userProfileServiceImpl.updateUserProfileAgreement(updateReq);
//			if (response.getUserId() > 0) {
//				userProfileResp = new ResponseEntity<>(response, HttpStatus.OK);
//			} else {
//				userProfileResp = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//			}
//
//		} catch (Exception ex) {
//			log.error(METHOD + "Exception occurred:: " + ex.getMessage());
//			throw ex;
//		}
//
//		log.info(METHOD + "Exit");
//		return userProfileResp;
//
//	}

}
