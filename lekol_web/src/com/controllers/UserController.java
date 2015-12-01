package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Role;
import com.entities.User;
import com.entities.User;
import com.services.UserService;
import com.services.UserService;

@ManagedBean
public class UserController {

/*	private User user = new User();

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
	}*/
	private User addUser;
	private User editUser;

	@EJB
	private UserService service;
	
	public UserController() {
		this.addUser = new User();
		this.addUser.setRole(new Role());
		this.editUser = new User();
		this.editUser.setRole(new Role());
	}

	public User getAddUser() {
		return addUser;
	}

	public void setAddUser(User addUser) {
		this.addUser = addUser;
	}

	public List<User> getListUser() {
		return service.getListUser();
	}

	public void createUser(User user) {
		service.addUser(user);
		this.addUser = new User();
		this.addUser.setRole(new Role());
	}

	public void editUser(User user) {
		service.saveUser(user);
		this.editUser = new User();
		this.editUser.setRole(new Role());
	}
	public User getEditUser() {
		return editUser;
	}

	public void setEditUser(User editUser) {
		this.editUser = editUser;
	}

	
}
