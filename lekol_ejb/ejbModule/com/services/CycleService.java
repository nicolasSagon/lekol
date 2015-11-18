package com.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Cycle;

/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class CycleService implements CycleServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public CycleService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addCycle(Cycle cycle) {
		em.persist(cycle);
	}

}
