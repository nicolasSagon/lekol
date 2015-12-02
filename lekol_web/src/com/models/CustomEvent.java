package com.models;

import java.util.Date;

import org.primefaces.model.DefaultScheduleEvent;

import com.entities.Teacher;
import com.entities.Class;
import com.entities.Room;

@SuppressWarnings("serial")
public class CustomEvent extends DefaultScheduleEvent{
	private Teacher teacher;
	private Class classe;
	private Room room;
	private int activityId;
	
	public CustomEvent(){
		this.teacher = new Teacher();
		this.classe = new Class();
		this.room = new Room();
	}
	
	public CustomEvent(String title, Date start, Date end, Teacher teacher, Class classe, Room room, int activityId) {
		this.setTitle(title);
		this.setStartDate(start);
		this.setEndDate(end);
		this.teacher = teacher;
		this.classe = classe;
		this.room = room;
		this.activityId = activityId;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Class getClasse() {
		return classe;
	}

	public void setClasse(Class classe) {
		this.classe = classe;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	
	
}
