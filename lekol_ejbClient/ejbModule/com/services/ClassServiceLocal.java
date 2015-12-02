package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Class;

@Local
public interface ClassServiceLocal {

	public void addClass(Class classe);

	public List<Class> getListClass();
	
	public void saveClass(Class classe);
}
