package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
	
	@Override
	public List<Cycle> getListCycle() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cycle> cq = cb.createQuery(Cycle.class);
        Root<Cycle> rootEntry = cq.from(Cycle.class);
        CriteriaQuery<Cycle> all = cq.select(rootEntry);
        TypedQuery<Cycle> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}

	@Override
	public void deleteCycle(Cycle cycle) {
		em.remove(em.contains(cycle) ? cycle : em.merge(cycle));
	}

	@Override
	public void updateCycle(Cycle cycle) {
		em.merge(cycle);
		
	}

}
