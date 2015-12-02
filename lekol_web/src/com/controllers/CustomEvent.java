package com.controllers;

import java.util.Date;

import org.primefaces.model.DefaultScheduleEvent;

import com.entities.Teacher;
import com.entities.Class;

public class CustomEvent extends DefaultScheduleEvent{
	private Teacher teacher;
	private Class classe;
	
	public CustomEvent(){
		
	}
	
	public CustomEvent(String title, Date start, Date end, Teacher teacher, Class classe) {
		this.setTitle(title);
		this.setStartDate(start);
		this.setEndDate(end);
		this.teacher = teacher;
		this.classe = classe;
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
}
