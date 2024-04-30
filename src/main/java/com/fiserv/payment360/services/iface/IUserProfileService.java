package com.fiserv.payment360.services.iface;

import com.fiserv.payment360.model.UserProfileResponse;
import com.fiserv.payment360.model.UserProfileUpdateReq;

public interface IUserProfileService {
	
	public UserProfileResponse getUserProfile(Integer userId) throws Exception;
	
	public UserProfileResponse updateUserProfileAgreement(UserProfileUpdateReq updateReq) throws Exception;
    


}
