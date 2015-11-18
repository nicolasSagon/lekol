package com.services;

import javax.ejb.Local;

import com.entities.Cycle;

@Local
public interface CycleServiceLocal {

	public void addCycle(Cycle cycle);
	
}
