package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import com.entities.School;
import com.entities.TypeSchool;
import com.services.SchoolService;

@ManagedBean
public class SchoolController {

	private School addSchool;
	private School editSchool;

	@EJB
	private SchoolService service;
	
	public SchoolController() {
		this.addSchool = new School();
		this.addSchool.setTypeSchool(new TypeSchool());
		this.editSchool = new School();
		this.editSchool.setTypeSchool(new TypeSchool());
	}

	public School getAddSchool() {
		return addSchool;
	}

	public void setAddSchool(School addSchool) {
		this.addSchool = addSchool;
	}

	public List<School> getListSchool() {
		return service.getListSchool();
	}

	public void createSchool(School school) {
		service.addSchool(school);
		this.addSchool = new School();
		this.addSchool.setTypeSchool(new TypeSchool());
	}

	public void editSchool(School School) {
		service.saveSchool(School);
		this.editSchool = new School();
		this.editSchool.setTypeSchool(new TypeSchool());
	}
	
	public School getEditSchool() {
		return editSchool;
	}

	public void setEditSchool(School editSchool) {
		this.editSchool = editSchool;
	}

	public void saveSchool(School schoolTmp, int typeSchoolId) {
		TypeSchool typeSchool = new TypeSchool();
		typeSchool.setId(typeSchoolId);
		schoolTmp.setTypeSchool(typeSchool);
		service.addSchool(schoolTmp);
	}
	
	public SelectItem convertToSelectItem(School school) {
		SelectItem item = new SelectItem();
		item.setLabel(school.getName());
		item.setValue(school.getId());
		return item;
	}
	
	public List<SelectItem> convertToListSelectItem(List<School> lstSchool) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		for(School school : lstSchool)
			list.add(convertToSelectItem(school));
		return list;
	}
	
}
