package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Cycle;
import com.entities.School;
import com.services.CycleService;
import com.services.SchoolService;

@ManagedBean
public class SchoolController {

	private School school = new School();

	@EJB
	private SchoolService service;
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	public List<School> getListSchool() {
		return service.getListSchool();
	}

	public void saveSchool(School school) {
		service.addSchool(school);
	}
	
}
