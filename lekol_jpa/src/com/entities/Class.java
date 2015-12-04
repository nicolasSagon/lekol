package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the class database table.
 * 
 */
@Entity
@NamedQuery(name="Class.findAll", query="SELECT c FROM Class c")
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Activity
	@OneToMany(mappedBy="clazz")
	private List<Activity> activities;

	//bi-directional many-to-one association to Child
	@OneToMany(mappedBy="clazz")
	private List<Child> childs;

	//bi-directional many-to-one association to Level
	@ManyToOne
	@JoinColumn(name="levelId")
	private Level level;

	//bi-directional many-to-one association to Room
	@ManyToOne
	@JoinColumn(name="roomId")
	private Room room;

	//bi-directional many-to-one association to School
	@ManyToOne
	@JoinColumn(name="schoolId")
	private School school;

	//bi-directional many-to-one association to Teacher
	@ManyToOne
	@JoinColumn(name="teacherId")
	private Teacher teacher;
	
	private String name;

	public Class() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Activity addActivity(Activity activity) {
		getActivities().add(activity);
		activity.setClazz(this);

		return activity;
	}

	public Activity removeActivity(Activity activity) {
		getActivities().remove(activity);
		activity.setClazz(null);

		return activity;
	}

	public List<Child> getChilds() {
		return this.childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Child addChild(Child child) {
		getChilds().add(child);
		child.setClazz(this);

		return child;
	}

	public Child removeChild(Child child) {
		getChilds().remove(child);
		child.setClazz(null);

		return child;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}