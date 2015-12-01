package com.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import com.entities.Cycle;
import com.services.CycleService;

@ManagedBean
public class CycleController {

	private Cycle cycle = new Cycle();

	@EJB
	private CycleService service;
	
	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

	public List<Cycle> getListCycle() {
		return service.getListCycle();
	}
	
	public void saveCycle(Cycle cycle) {
		service.addCycle(cycle);
	}
	
	public void deleteCycle(Cycle cycle){
		service.deleteCycle(cycle);
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
