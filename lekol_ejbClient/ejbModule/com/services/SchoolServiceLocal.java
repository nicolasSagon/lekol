package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.School;

@Local
public interface SchoolServiceLocal {

	public void addSchool(School school);
	
	public List<School> getListSchool();
	
}
