package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Teacher;
import com.services.TeacherService;

@ManagedBean
public class TeacherController {

	private Teacher teacher = new Teacher();

	@EJB
	private TeacherService service;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Teacher> getListTeacher() {
		return service.getListTeacher();
	}
	
	public void saveTeacher(Teacher teacher) {
		service.addTeacher(teacher);
	}
	
}
