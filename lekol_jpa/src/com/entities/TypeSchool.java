package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the type_school database table.
 * 
 */
@Entity
@Table(name="type_school")
@NamedQuery(name="TypeSchool.findAll", query="SELECT t FROM TypeSchool t")
public class TypeSchool implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to School
	@OneToMany(mappedBy="typeSchool")
	private List<School> schools;

	public TypeSchool() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<School> getSchools() {
		return this.schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public School addSchool(School school) {
		getSchools().add(school);
		school.setTypeSchool(this);

		return school;
	}

	public School removeSchool(School school) {
		getSchools().remove(school);
		school.setTypeSchool(null);

		return school;
	}

}