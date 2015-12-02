package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Cycle;

@Local
public interface CycleServiceLocal {

	public void addCycle(Cycle cycle);

	public List<Cycle> getListCycle();
	
	public Cycle getCycle(int id);
	
	public void saveCycle(Cycle cycle);
}
