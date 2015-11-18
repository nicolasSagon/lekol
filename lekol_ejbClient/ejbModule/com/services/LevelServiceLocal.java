package com.services;

import javax.ejb.Local;

import com.entities.Level;

@Local
public interface LevelServiceLocal {

	public void addLevel(Level level);
	
}
