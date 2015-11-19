package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Cycle;
import com.entities.TypeSchool;
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
	
}
