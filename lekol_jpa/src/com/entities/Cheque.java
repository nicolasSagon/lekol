package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cheque database table.
 * 
 */
@Entity
@NamedQuery(name="Cheque.findAll", query="SELECT c FROM Cheque c")
public class Cheque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int amount;

	private String bankName;

	@Temporal(TemporalType.DATE)
	private Date collactionDate;

	private String number;

	private String tutorName;

	//bi-directional many-to-one association to Payment
	@ManyToOne
	@JoinColumn(name="paymentId")
	private Payment payment;

	public Cheque() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Date getCollactionDate() {
		return this.collactionDate;
	}

	public void setCollactionDate(Date collactionDate) {
		this.collactionDate = collactionDate;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTutorName() {
		return this.tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}