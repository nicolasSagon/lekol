package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the family database table.
 * 
 */
@Entity
@NamedQuery(name="Family.findAll", query="SELECT f FROM Family f")
public class Family implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String inChargeAddress;

	private String inChargeFirstName;

	private String inChargeLastName;

	private String inChargePhone;

	private String parent1Address;

	private String parent1FamilySituation;

	private String parent1FirstName;

	private String parent1HomePhone;

	private String parent1LastName;

	private String parent1Mail;

	private String parent1MobilePhone;

	private String parent1SocialSecurityNumber;

	private String parent2Address;

	private String parent2FamilySituation;

	private String parent2FirstName;

	private String parent2HomePhone;

	private String parent2LastName;

	private String parent2Mail;

	private String parent2MobilePhone;

	private String parent2SocialSecurityNumber;

	//bi-directional many-to-one association to Child
	@OneToMany(mappedBy="family")
	private List<Child> childs;

	//bi-directional many-to-one association to Payment
	@ManyToOne
	@JoinColumn(name="paymentId")
	private Payment payment;

	public Family() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInChargeAddress() {
		return this.inChargeAddress;
	}

	public void setInChargeAddress(String inChargeAddress) {
		this.inChargeAddress = inChargeAddress;
	}

	public String getInChargeFirstName() {
		return this.inChargeFirstName;
	}

	public void setInChargeFirstName(String inChargeFirstName) {
		this.inChargeFirstName = inChargeFirstName;
	}

	public String getInChargeLastName() {
		return this.inChargeLastName;
	}

	public void setInChargeLastName(String inChargeLastName) {
		this.inChargeLastName = inChargeLastName;
	}

	public String getInChargePhone() {
		return this.inChargePhone;
	}

	public void setInChargePhone(String inChargePhone) {
		this.inChargePhone = inChargePhone;
	}

	public String getParent1Address() {
		return this.parent1Address;
	}

	public void setParent1Address(String parent1Address) {
		this.parent1Address = parent1Address;
	}

	public String getParent1FamilySituation() {
		return this.parent1FamilySituation;
	}

	public void setParent1FamilySituation(String parent1FamilySituation) {
		this.parent1FamilySituation = parent1FamilySituation;
	}

	public String getParent1FirstName() {
		return this.parent1FirstName;
	}

	public void setParent1FirstName(String parent1FirstName) {
		this.parent1FirstName = parent1FirstName;
	}

	public String getParent1HomePhone() {
		return this.parent1HomePhone;
	}

	public void setParent1HomePhone(String parent1HomePhone) {
		this.parent1HomePhone = parent1HomePhone;
	}

	public String getParent1LastName() {
		return this.parent1LastName;
	}

	public void setParent1LastName(String parent1LastName) {
		this.parent1LastName = parent1LastName;
	}

	public String getParent1Mail() {
		return this.parent1Mail;
	}

	public void setParent1Mail(String parent1Mail) {
		this.parent1Mail = parent1Mail;
	}

	public String getParent1MobilePhone() {
		return this.parent1MobilePhone;
	}

	public void setParent1MobilePhone(String parent1MobilePhone) {
		this.parent1MobilePhone = parent1MobilePhone;
	}

	public String getParent1SocialSecurityNumber() {
		return this.parent1SocialSecurityNumber;
	}

	public void setParent1SocialSecurityNumber(String parent1SocialSecurityNumber) {
		this.parent1SocialSecurityNumber = parent1SocialSecurityNumber;
	}

	public String getParent2Address() {
		return this.parent2Address;
	}

	public void setParent2Address(String parent2Address) {
		this.parent2Address = parent2Address;
	}

	public String getParent2FamilySituation() {
		return this.parent2FamilySituation;
	}

	public void setParent2FamilySituation(String parent2FamilySituation) {
		this.parent2FamilySituation = parent2FamilySituation;
	}

	public String getParent2FirstName() {
		return this.parent2FirstName;
	}

	public void setParent2FirstName(String parent2FirstName) {
		this.parent2FirstName = parent2FirstName;
	}

	public String getParent2HomePhone() {
		return this.parent2HomePhone;
	}

	public void setParent2HomePhone(String parent2HomePhone) {
		this.parent2HomePhone = parent2HomePhone;
	}

	public String getParent2LastName() {
		return this.parent2LastName;
	}

	public void setParent2LastName(String parent2LastName) {
		this.parent2LastName = parent2LastName;
	}

	public String getParent2Mail() {
		return this.parent2Mail;
	}

	public void setParent2Mail(String parent2Mail) {
		this.parent2Mail = parent2Mail;
	}

	public String getParent2MobilePhone() {
		return this.parent2MobilePhone;
	}

	public void setParent2MobilePhone(String parent2MobilePhone) {
		this.parent2MobilePhone = parent2MobilePhone;
	}

	public String getParent2SocialSecurityNumber() {
		return this.parent2SocialSecurityNumber;
	}

	public void setParent2SocialSecurityNumber(String parent2SocialSecurityNumber) {
		this.parent2SocialSecurityNumber = parent2SocialSecurityNumber;
	}

	public List<Child> getChilds() {
		return this.childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Child addChild(Child child) {
		getChilds().add(child);
		child.setFamily(this);

		return child;
	}

	public Child removeChild(Child child) {
		getChilds().remove(child);
		child.setFamily(null);

		return child;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}