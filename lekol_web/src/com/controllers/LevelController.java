package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import com.entities.Cycle;
import com.entities.Level;
import com.services.LevelService;

@RequestScoped
@ManagedBean
public class LevelController {

	private Level addLevel;
	private Level editLevel;

	@EJB
	private LevelService service;
	
	public LevelController() {
		this.addLevel = new Level();
		this.addLevel.setCycle(new Cycle());
		this.editLevel = new Level();
		this.editLevel.setCycle(new Cycle());
	}

	public Level getAddLevel() {
		return addLevel;
	}

	public void setAddLevel(Level addLevel) {
		this.addLevel = addLevel;
	}

	public List<Level> getListLevel() {
		return service.getListLevel();
	}

	public void createLevel(Level level) {
		service.addLevel(level);
		this.addLevel = new Level();
		this.addLevel.setCycle(new Cycle());
	}

	public void editLevel(Level level) {
		service.saveLevel(level);
		this.editLevel = new Level();
		this.editLevel.setCycle(new Cycle());
	}
	
	public Level getEditLevel() {
		return editLevel;
	}

	public void setEditLevel(Level editLevel) {
		this.editLevel = editLevel;
	}
	
	public SelectItem convertToSelectItem(Level level) {
		SelectItem item = new SelectItem();
		item.setLabel(level.getName());
		item.setValue(level.getId());
		return item;
	}
	
	public List<SelectItem> convertToListSelectItem(List<Level> lstLevel) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		for(Level level : lstLevel)
			list.add(convertToSelectItem(level));
		return list;
	}

}
