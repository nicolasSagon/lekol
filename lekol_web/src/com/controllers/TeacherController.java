package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import com.entities.Teacher;
import com.services.TeacherService;

@ManagedBean
public class TeacherController {


	private Teacher addTeacher;
	private Teacher editTeacher;

	@EJB
	private TeacherService service;
	
	public TeacherController() {
		this.addTeacher = new Teacher();
		this.editTeacher = new Teacher();
	}

	public Teacher getAddTeacher() {
		return addTeacher;
	}

	public void setAddTeacher(Teacher addTeacher) {
		this.addTeacher = addTeacher;
	}

	public List<Teacher> getListTeacher() {
		return service.getListTeacher();
	}

	public void createTeacher(Teacher teacher) {
		service.addTeacher(teacher);
		this.addTeacher = new Teacher();
	}

	public void editTeacher(Teacher teacher) {
		service.editTeacher(teacher);
		this.editTeacher = new Teacher();
	}
	
	public Teacher getEditTeacher() {
		return editTeacher;
	}

	public void setEditTeacher(Teacher editTeacher) {
		this.editTeacher = editTeacher;
	}
	
	public SelectItem convertToSelectItem(Teacher teacher) {
		SelectItem item = new SelectItem();
		item.setLabel(teacher.getFirstName() + " " + teacher.getLastName());
		item.setValue(teacher.getId());
		return item;
	}
	
	public List<SelectItem> convertToListSelectItem(List<Teacher> lstTeacher) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		for(Teacher teacher : lstTeacher)
			list.add(convertToSelectItem(teacher));
		return list;
	}
	
	
}
