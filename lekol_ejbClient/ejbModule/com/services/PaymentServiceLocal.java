package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Payment;

@Local
public interface PaymentServiceLocal {

	public void addPayment(Payment payment);
	public List<Payment> getListPayment();
	public void deletePayment(Payment payment);
	public void updatePayment(Payment payment);
}
