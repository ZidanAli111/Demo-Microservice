package com.fiserv.payment360.services.iface;

import java.util.List;

import com.fiserv.payment360.entity.UserProfileEntity;

public interface serviceIface {
 
	//public UserProfileResponse getUserProfile(Integer userId);
	public List<UserProfileEntity> getUserProfile();
}
