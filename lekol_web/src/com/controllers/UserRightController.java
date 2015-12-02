package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.entities.User;
import com.services.UserService;

@ManagedBean(name = "userModelBean")
@SessionScoped
public class UserRightController {
    
	private User userConnected = new User();
	@EJB
    private UserService service;
	
    public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
	}

	public boolean exists(User user){
		List<User> users = new ArrayList<User>();
		users = service.signInUser(user);
		if(users.size() > 0){
			this.userConnected = users.get(0);
			return true;
		}else{
			return false;
		}
	}
	
	public void logOut(){
		this.userConnected.setId(-1);
	}
	
	public boolean isConnected(){
		if(this.userConnected.getId() > 0){
			return true;
		}else{
			return false;
		}
	}
    
	public boolean isNotConnected(){
		if(this.userConnected.getId() > 0){
			return false;
		}else{
			return true;
		}
	}
	
    public boolean isAdmin(){
    	int id = this.userConnected.getId();
    	if (id <= 0){
    		return false;
    	}else{
    		boolean ret = false;
            if(service.getUser(id).getRole().getName() == "Administrateur"){ret = true;}else{this.userConnected = null;}
            return ret;
    	}
        
    }
    
    public boolean isTeacher(){
    	int id = this.userConnected.getId();
    	if (id <= 0){
      		return false;
    	}else{
	        boolean ret = false;
	        if(service.getUser(id).getRole().getName() == "Professeur"){ret = true;}else{this.userConnected = null;}
	        return ret;
        }
    }

}
