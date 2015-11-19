package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Cycle;

@Local
public interface CycleServiceLocal {

	public void addCycle(Cycle cycle);
	public List<Cycle> getListCycle();
	public void deleteCycle(Cycle cycle);
	public void updateCycle(Cycle cycle);
}
