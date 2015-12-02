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
	@EJB
    private UserService service;
	
    public User getUserConnected() {
		return userConnected;
	}

	public void setUserConnected(User userConnected) {
		this.userConnected = userConnected;
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
	
	public boolean isConnected(){
		if(this.userConnected.getId() > 0){
			return true;
		}else{
			return false;
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
