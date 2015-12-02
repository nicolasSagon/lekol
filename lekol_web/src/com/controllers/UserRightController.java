package com.controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.entities.User;
import com.services.UserService;

@ManagedBean(name = "userModelBean")
@SessionScoped
public class UserRightController {
    
	private User userConnected;
	
    public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public boolean exists(User user){
		int id =  service.signInUser(user);
		if(id <= 0){
			this.userConnected = null;
			return false;
		}else{
			this.userConnected.setId(id);
			return true;
		}
	}
	
	public void logOut(){
		this.userConnected = null;
	}
	
	@EJB
    private UserService service;
    
    public boolean isAdmin(int id){
        boolean ret = false;
        if(service.getUser(id).getRole().getName() == "Administrateur"){ret = true;}else{this.userConnected = null;}
        return ret;
    }
    
    public boolean isTeacher(int id){
        boolean ret = false;
        if(service.getUser(id).getRole().getName() == "Professeur"){ret = true;}else{this.userConnected = null;}
        return ret;
    }

}
