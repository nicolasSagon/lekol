package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import com.entities.Cycle;
import com.services.CycleService;

@RequestScoped
@ManagedBean
public class CycleController {

	private Cycle addCycle;
	private Cycle editCycle;

	@EJB
	private CycleService service;
	
	public CycleController() {
		this.addCycle = new Cycle();
		this.editCycle = new Cycle();
	}

	public Cycle getAddCycle() {
		return addCycle;
	}

	public void setAddCycle(Cycle addCycle) {
		this.addCycle = addCycle;
	}

	public List<Cycle> getListCycle() {
		return service.getListCycle();
	}

	public void createCycle(Cycle cycle) {
		service.addCycle(cycle);
		this.addCycle = new Cycle();
	}

	public void editCycle(Cycle cycle) {
		service.saveCycle(cycle);
		this.editCycle = new Cycle();
	}
	
	public Cycle getEditCycle() {
		return editCycle;
	}

	public void setEditCycle(Cycle editCycle) {
		this.editCycle = editCycle;
	}
	
	public SelectItem convertToSelectItem(Cycle cycle) {
		SelectItem item = new SelectItem();
		item.setLabel(cycle.getName());
		item.setValue(cycle.getId());
		return item;
	}
	
	public List<SelectItem> convertToListSelectItem(List<Cycle> lstCycle) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		for(Cycle cycle : lstCycle)
			list.add(convertToSelectItem(cycle));
		return list;
	}

}
