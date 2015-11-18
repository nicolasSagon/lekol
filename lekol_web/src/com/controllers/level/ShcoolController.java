package com.controllers.level;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.School;
import com.services.SchoolService;

@ManagedBean
public class ShcoolController {

	private School school = new School();

	@EJB
	private SchoolService service;
	
	public School getSchool() {
		return school;
	}
	
	public void saveSchool(School school) {
		service.addSchool(school);
	}
	
}
