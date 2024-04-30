package com.fiserv.payment360.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiserv.payment360.entity.PaymentDetailsEntity;
import com.fiserv.payment360.helper.PaymentHelper;
import com.fiserv.payment360.model.Payment;
import com.fiserv.payment360.repository.PaymentDetailsRepository;
import com.fiserv.payment360.service.iface.IPaymentsService;
import com.fiserv.payment360.util.P360Util;

@Service
public class PaymentServiceImpl implements IPaymentsService {

	@Autowired
	PaymentDetailsRepository paymentDetailsRepo;

	@Autowired
	PaymentHelper paymentHelper;

	@Override
	public List<Payment> fetchPaymentsByUserId(Integer userId) throws Exception {

		Optional<List<PaymentDetailsEntity>> paymentOpt = paymentDetailsRepo.findBySenderId(userId);
		List<Payment> payments = new ArrayList<>();
		if (paymentOpt.isPresent()) {
			List<PaymentDetailsEntity> paymentEntityList = paymentOpt.get();
			
			paymentEntityList.stream().forEach(entity -> {
				long days = -1;
				Payment payment = new Payment();
				payment.setPaymentId(entity.getPaymentId());
				payment.setSenderName(paymentHelper.fetchSenderName(entity.getSenderId()));
				payment.setRecipientName(paymentHelper.fetchRecipientName(entity.getRecipientId()));
				// AMOUNT - convert BigDecimal to String

				payment.setAmount(P360Util.convertBDToString(entity.getAmount()));

				// Payment Status
				payment.setPaymentStatus(paymentHelper.getPaymentStatus(entity.getPaymentStatusId()));

				// Payment Avenue - Zelle or Bill pay
				payment.setPaymentAvenue(entity.getPaymentChannel());

				// Zelle Limit - only applicable for Zelle

				// todo flag -- determines if to-do or, upcoming -- apply logic for <= 7 days
				days = paymentHelper.getDiffDays(entity.getPayeeDueDate());
				payment.setDays(days);
				if(days<=7) {
					payment.setTodoFlag(true); //due-soon
				} else {
					payment.setTodoFlag(false); //upcoming
				}
				
				//hard-coding zelle limit for now as it needs to be obtained from Zelle API
				if(entity.getPaymentChannel().equalsIgnoreCase("Zelle")) {
					payment.setZelleLimit("10,000.00");
				} else {
					payment.setZelleLimit("");
				}
				
				payments.add(payment);

			});
		}

		return payments;
	}

}
