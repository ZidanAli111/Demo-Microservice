package com.fiserv.payment360.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiserv.payment360.entity.PaymentDetailsEntity;

@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetailsEntity, Integer> {

	Optional<List<PaymentDetailsEntity>> findBySenderId(Integer senderId);

}
