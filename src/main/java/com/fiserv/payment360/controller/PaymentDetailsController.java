package com.fiserv.payment360.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.payment360.entity.PayeeDetailsEntity;
import com.fiserv.payment360.exception.ApiError;
import com.fiserv.payment360.model.Payment;
import com.fiserv.payment360.service.iface.IPaymentsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@Tag(name="PayeeDetailsEntity", description = "Payment Details Controller API" )
public class PaymentDetailsController {

	@Autowired
	 IPaymentsService paymentDetailsService;
    @CrossOrigin(origins="http://localhost:4200")
	@Operation(summary = "Fetch Payment and Payee details", description = "Get a payee  object by specifying its- payment id.", tags = { "Payment Details" })
	@ApiResponses({ @ApiResponse(responseCode = "200", content = {
			@Content(schema = @Schema(implementation = PayeeDetailsEntity.class), mediaType = "application/json") }),
			@ApiResponse(responseCode = "400", description = "BAD REQUEST", content = {
					@Content(schema = @Schema(implementation = ApiError.class)) }),
			@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = {
					@Content(schema = @Schema(implementation = ApiError.class)) }) })
	@GetMapping("/api/todoinformation/{userId}")
	public ResponseEntity<List<Payment>> getPaymentsById(@PathVariable("userId") Integer userId) throws Exception {
		
		List<Payment> payments = null;
		payments = paymentDetailsService.fetchPaymentsByUserId(userId);
		return new ResponseEntity<>(payments, HttpStatus.OK);
		
	}	


}
