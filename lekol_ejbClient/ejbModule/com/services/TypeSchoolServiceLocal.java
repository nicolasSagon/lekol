package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.School;
import com.entities.TypeSchool;

@Local
public interface TypeSchoolServiceLocal {

	public void addTypeSchool(TypeSchool typeSchool);
	
	public List<TypeSchool> getListTypeSchool();
	
}
