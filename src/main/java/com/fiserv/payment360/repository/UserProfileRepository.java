package com.fiserv.payment360.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiserv.payment360.entity.UserProfileEntity;

public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Integer> {

}
