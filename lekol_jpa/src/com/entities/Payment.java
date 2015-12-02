package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity
@NamedQuery(name="Payment.findAll", query="SELECT p FROM Payment p")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int frequency;

	private String mode;

	//bi-directional many-to-one association to Cheque
	@OneToMany(mappedBy="payment")
	private List<Cheque> cheques;

	//bi-directional many-to-one association to Family
	@OneToMany(mappedBy="payment")
	private List<Family> families;

	public Payment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFrequency() {
		return this.frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<Cheque> getCheques() {
		return this.cheques;
	}

	public void setCheques(List<Cheque> cheques) {
		this.cheques = cheques;
	}

	public Cheque addCheque(Cheque cheque) {
		getCheques().add(cheque);
		cheque.setPayment(this);

		return cheque;
	}

	public Cheque removeCheque(Cheque cheque) {
		getCheques().remove(cheque);
		cheque.setPayment(null);

		return cheque;
	}

	public List<Family> getFamilies() {
		return this.families;
	}

	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	public Family addFamily(Family family) {
		getFamilies().add(family);
		family.setPayment(this);

		return family;
	}

	public Family removeFamily(Family family) {
		getFamilies().remove(family);
		family.setPayment(null);

		return family;
	}

}