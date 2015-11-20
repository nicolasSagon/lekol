package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.School;
<<<<<<< HEAD
import com.entities.TypeSchool;
import com.services.CycleService;
=======
>>>>>>> fe07e0565881440585c4f74bf38e3cd809882f6c
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

	public void saveSchool(School schoolTmp, int typeSchoolId) {
		TypeSchoolController tyeSchoolController = new TypeSchoolController();
		schoolTmp.setTypeSchool(tyeSchoolController.getTypeById(typeSchoolId));
		service.addSchool(schoolTmp);
	}
	
}
