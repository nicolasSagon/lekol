package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.entities.User;
import com.services.UserService;

@ManagedBean(name = "userModelBean")
@SessionScoped
@ApplicationScoped
public class UserRightController {

	private User userConnected = new User();
	@EJB
	private UserService service;

	public User getUserConnected() {
		return this.userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	public boolean exists(User user) {
		List<User> users = new ArrayList<User>();
		users = service.signInUser(user);
		if (users.size() > 0) {
			HttpSession session = (HttpSession) FacesContext
					.getCurrentInstance().getExternalContext()
					.getSession(false);
			session.setAttribute("user", users.get(0));
			return true;
		} else {
			return false;
		}
	}

	public void logOut() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
	}

	public boolean isConnected() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		try {
			if (session.getAttribute("user") != null) {
				return true;
			}
		} catch (Exception e) {
			throw e;
		}
		return false;
	}

	public User getCurrentUser() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		return (User) session.getAttribute("user");
	}

	public boolean isAdmin() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		try {
			if (session.getAttribute("user") != null) {
				return ((User) session.getAttribute("user")).getRole().getId() == 1;
			}
		} catch (Exception e) {
			throw e;
		}
		return false;

	}

	public boolean isTeacher() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		try {
			if (session.getAttribute("user") != null) {
				return ((User) session.getAttribute("user")).getRole().getId() == 2;
			}
		} catch (Exception e) {
			throw e;
		}
		return false;
	}

}
