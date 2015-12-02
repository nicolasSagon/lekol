package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.TypeSchool;

@Local
public interface TypeSchoolServiceLocal {

	public void addTypeSchool(TypeSchool typeSchool);
	
	public void deleteTypeSchool(TypeSchool typeSchool);
	
	public void modifyTypeSchool(TypeSchool typeSchool);
	
	public TypeSchool getTypeById(int id);
	
	public List<TypeSchool> getListTypeSchool();

	void saveTypeSchool(TypeSchool typeSchool);

	public TypeSchool getTypeSchool(int id);
	
}
