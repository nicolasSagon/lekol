package com.services;

import javax.ejb.Local;

import com.entities.School;

@Local
public interface SchoolServiceLocal {

	public void addSchool(School school);
	
}
