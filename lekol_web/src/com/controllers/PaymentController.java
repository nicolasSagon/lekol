package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Payment;
import com.services.PaymentService;

@ManagedBean
public class PaymentController {

	private Payment payment = new Payment();

	@EJB
	private PaymentService service;
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<Payment> getListPayment() {
		return service.getListPayment();
	}
	
	public void savePayment(Payment payment) {
		service.addPayment(payment);
	}
	
}
