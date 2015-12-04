package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the teacher database table.
 * 
 */
@Entity
@NamedQuery(name="Teacher.findAll", query="SELECT t FROM Teacher t")
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	//bi-directional many-to-one association to Activity
	@OneToMany(mappedBy="teacher")
	private List<Activity> activities;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="teacher")
	private List<Class> clazzs;

	public Teacher() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Activity addActivity(Activity activity) {
		getActivities().add(activity);
		activity.setTeacher(this);

		return activity;
	}

	public Activity removeActivity(Activity activity) {
		getActivities().remove(activity);
		activity.setTeacher(null);

		return activity;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

	public Class addClazz(Class clazz) {
		getClazzs().add(clazz);
		clazz.setTeacher(this);

		return clazz;
	}

	public Class removeClazz(Class clazz) {
		getClazzs().remove(clazz);
		clazz.setTeacher(null);

		return clazz;
	}

}