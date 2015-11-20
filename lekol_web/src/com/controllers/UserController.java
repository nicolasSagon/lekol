package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.User;
import com.services.UserService;

@ManagedBean
public class UserController {

	private User user = new User();

	@EJB
	private UserService service;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public List<User> getListUser() {
		return service.getListUser();
	}

	public void saveUser(User user) {
		service.addUser(user);
	}
	
}
