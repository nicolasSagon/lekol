package com.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the activity database table.
 * 
 */
@Entity
@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	private Date endDate;

	//bi-directional many-to-one association to Room
	@ManyToOne
	@JoinColumn(name="roomId")
	private Room room;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="classId")
	private Class clazz;

	//bi-directional many-to-one association to Teacher
	@ManyToOne
	@JoinColumn(name="teacherId")
	private Teacher teacher;

	public Activity() {
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

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Class getClazz() {
		return this.clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}