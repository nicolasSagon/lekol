package com.controllers.level;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Level;
import com.services.LevelService;

@ManagedBean
public class LevelController {

	private Level level = new Level();

	@EJB
	private LevelService service;
	
	public Level getNiveau() {
		return level;
	}

	public void setEmployee(Level level) {
		this.level = level;
	}

	public void saveLevel(Level level) {
		service.addLevel(level);
	}
	
}
