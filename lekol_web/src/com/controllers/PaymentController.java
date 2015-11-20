package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Payment;
import com.services.PaymentService;

@ManagedBean
public class PaymentController {

	private Payment payment = new Payment();
	private String[] modes = {"CB","Cheque","Espèces"};
	@EJB
	private PaymentService service;
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<Payment> getListPayment() {
		
		List<Payment> payments  = service.getListPayment();
		for(Payment p : payments)
			System.out.println(p.getId());
		return payments;
	}
	
	public void savePayment(Payment payment) {
		service.addPayment(payment);
	}

	public String[] getModes() {
		return modes;
	}

	public void setModes(String[] modes) {
		this.modes = modes;
	}
	
}
