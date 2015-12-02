package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Activity;

@Local
public interface ActivityServiceLocal {

	public void addActivity(Activity activity);

	public List<Activity> getListActivity();

	public List<Activity> getListActivityByClassId(int classId);
	
	public Activity getActivity(int id);
	
	public void saveActivity(Activity activity);
}
