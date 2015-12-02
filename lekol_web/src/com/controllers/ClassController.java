package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.entities.Class;
import com.entities.Level;
import com.entities.Room;
import com.entities.School;
import com.entities.Teacher;
import com.services.ClassService;

@RequestScoped
@ManagedBean
public class ClassController {

	private Class addClass;
	private Class editClass;

	@EJB
	private ClassService service;
	
	public ClassController() {
		this.addClass = new Class();
		this.addClass.setLevel(new Level());
		this.addClass.setRoom(new Room());
		this.addClass.setSchool(new School());
		this.addClass.setTeacher(new Teacher());
		this.editClass = new Class();
		this.editClass.setLevel(new Level());
		this.editClass.setRoom(new Room());
		this.editClass.setSchool(new School());
		this.editClass.setTeacher(new Teacher());
	}

	public Class getAddClass() {
		return addClass;
	}

	public void setAddClass(Class addClass) {
		this.addClass = addClass;
	}

	public List<Class> getListClass() {
		return service.getListClass();
	}

	public void createClass(Class classe) {
		service.addClass(classe);
		this.addClass = new Class();
		this.addClass.setLevel(new Level());
		this.addClass.setRoom(new Room());
		this.addClass.setSchool(new School());
		this.addClass.setTeacher(new Teacher());
	}

	public void editClass(Class classe) {
		service.saveClass(classe);
		this.editClass = new Class();
		this.editClass.setLevel(new Level());
		this.editClass.setRoom(new Room());
		this.editClass.setSchool(new School());
		this.editClass.setTeacher(new Teacher());
	}
	
	public Class getEditClass() {
		return editClass;
	}

	public void setEditClass(Class editClass) {
		this.editClass = editClass;
	}

}
