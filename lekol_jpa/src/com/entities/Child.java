package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the child database table.
 * 
 */
@Entity
@NamedQuery(name="Child.findAll", query="SELECT c FROM Child c")
public class Child implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String firstName;

	private String gender;

	private String lastName;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="classId")
	private Class clazz;

	//bi-directional many-to-one association to Family
	@ManyToOne
	@JoinColumn(name="familyId")
	private Family family;

	//bi-directional many-to-one association to School
	@ManyToOne
	@JoinColumn(name="schoolId")
	private School school;

	public Child() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Class getClazz() {
		return this.clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Family getFamily() {
		return this.family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}