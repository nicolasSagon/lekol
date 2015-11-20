package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Level;

@Local
public interface LevelServiceLocal {

	public void addLevel(Level level);

	public List<Level> getListLevel();
	
	public Level getLevel(int id);
	
	public void saveLevel(Level level);
}
