package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.TypeSchool;
import com.services.TypeSchoolService;

@ManagedBean
public class TypeSchoolController {

	private TypeSchool typeSchool = new TypeSchool();

	@EJB
	private TypeSchoolService service;
	
	public TypeSchool getTypeSchool() {
		return typeSchool;
	}

	public void setTypeSchool(TypeSchool typeSchool) {
		this.typeSchool = typeSchool;
	}
	
	public List<TypeSchool> getListTypeSchool() {
		return service.getListTypeSchool();
	}

	public void saveTypeSchool(TypeSchool typeSchool) {
		service.addTypeSchool(typeSchool);
	}
	
}
