package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Teacher;

@Local
public interface TeacherServiceLocal {

	public void addTeacher(Teacher teacher);
	public List<Teacher> getListTeacher();
	public void editTeacher(Teacher teacher);
}
