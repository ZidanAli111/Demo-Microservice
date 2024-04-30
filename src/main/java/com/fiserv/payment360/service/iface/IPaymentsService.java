package com.fiserv.payment360.service.iface;

import java.util.List;

import com.fiserv.payment360.model.Payment;

public interface IPaymentsService {
	
	public List<Payment> fetchPaymentsByUserId(Integer userId) throws Exception;

}
