package com.controllers.level;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

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

	public void saveLevel(Cycle cycle) {
		service.addCycle(cycle);
	}
	
}
