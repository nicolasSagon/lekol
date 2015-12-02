package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the school database table.
 * 
 */
@Entity
@NamedQuery(name="School.findAll", query="SELECT s FROM School s")
public class School implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	private String directorMail;

	private String directorName;

	private String directPhone;

	private String fax;

	private String name;

	private int numberRoom;

	private String phone;

	private int surface;

	//bi-directional many-to-one association to Child
	@OneToMany(mappedBy="school")
	private List<Child> childs;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="school")
	private List<Class> clazzs;

	//bi-directional many-to-one association to TypeSchool
	@ManyToOne
	@JoinColumn(name="typeId")
	private TypeSchool typeSchool;

	public School() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDirectorMail() {
		return this.directorMail;
	}

	public void setDirectorMail(String directorMail) {
		this.directorMail = directorMail;
	}

	public String getDirectorName() {
		return this.directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDirectPhone() {
		return this.directPhone;
	}

	public void setDirectPhone(String directPhone) {
		this.directPhone = directPhone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberRoom() {
		return this.numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSurface() {
		return this.surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public List<Child> getChilds() {
		return this.childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Child addChild(Child child) {
		getChilds().add(child);
		child.setSchool(this);

		return child;
	}

	public Child removeChild(Child child) {
		getChilds().remove(child);
		child.setSchool(null);

		return child;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

	public Class addClazz(Class clazz) {
		getClazzs().add(clazz);
		clazz.setSchool(this);

		return clazz;
	}

	public Class removeClazz(Class clazz) {
		getClazzs().remove(clazz);
		clazz.setSchool(null);

		return clazz;
	}

	public TypeSchool getTypeSchool() {
		return this.typeSchool;
	}

	public void setTypeSchool(TypeSchool typeSchool) {
		this.typeSchool = typeSchool;
	}

}