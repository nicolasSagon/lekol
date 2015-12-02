package com.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the activity database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a"),
	@NamedQuery(name="Activity.findAllByClassId",query="SELECT a FROM Activity a WHERE a.clazz = :class")
})
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="classId")
	private Class clazz;
	
	//bi-directional many-to-one association to Room
	@ManyToOne
	@JoinColumn(name="roomId")
	private Room room;

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

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Class getClazz() {
		return this.clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}