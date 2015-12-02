package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Activity;

@Local
public interface ActivityServiceLocal {

	public int addActivity(Activity activity);

	public List<Activity> getListActivity();
	
	public Activity getActivity(int id);
	
	public void saveActivity(Activity activity);

	List<Activity> getAllActivities(int id);

	void deleteActivity(int id);
}
