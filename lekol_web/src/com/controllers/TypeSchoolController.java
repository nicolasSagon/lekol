package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

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

	public String saveTypeSchool(TypeSchool typeSchool) {
		service.addTypeSchool(typeSchool);
		return "show_list_type_school.xhtml?faces-redirect=true";
	}
	
	public String modifyTypeSchool(TypeSchool typeSchool) {
		
		return "show_list_type_school.xhtml?faces-redirect=true";
	}
	
	public String deleteTypeSchool(TypeSchool typeSchool) {
		service.deleteTypeSchool(typeSchool);
		return "show_list_type_school.xhtml?faces-redirect=true";
	}
	
	public List<SelectItem> getListSelectItem(List<TypeSchool> typeSchools) {
		List<SelectItem> listSelectItems = new ArrayList<SelectItem>();
		for(TypeSchool typeSchool: typeSchools) {
			SelectItem item = new SelectItem();
			item.setLabel(typeSchool.getName());
			item.setValue(typeSchool.getId());
			listSelectItems.add(item);
		}
		return listSelectItems;
	}
}
