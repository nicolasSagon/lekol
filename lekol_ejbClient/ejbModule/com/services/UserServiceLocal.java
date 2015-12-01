package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.User;

@Local
public interface UserServiceLocal {

	public void addUser(User user);
	
	public List<User> getListUser();

	User getUser(int id);

	void saveUser(User user);
	
}
