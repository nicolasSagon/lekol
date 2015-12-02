package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import sun.util.logging.resources.logging;

import com.entities.Cycle;

/**
 * Session Bean implementation class cycleService
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Cycle> getListCycle() {
		return em.createNamedQuery("Cycle.findAll").getResultList();
	}
	
	@Override
	public Cycle getCycle(int id) {
		Cycle cycle = em.find(Cycle.class, id);
		return cycle;
	}

	@Override
	public void saveCycle(Cycle cycle) {
		Cycle l = this.getCycle(cycle.getId());
		l.setName(cycle.getName());
		em.merge(l);	
	}

}
