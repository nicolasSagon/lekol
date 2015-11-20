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

import com.entities.Cheque;

/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class ChequeService implements ChequeServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ChequeService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addCheque(Cheque cheque) {
		em.persist(cheque);
	}
	
	@Override
	public List<Cheque> getListCheque() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cheque> cq = cb.createQuery(Cheque.class);
        Root<Cheque> rootEntry = cq.from(Cheque.class);
        CriteriaQuery<Cheque> all = cq.select(rootEntry);
        TypedQuery<Cheque> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}

	@Override
	public void deleteCheque(Cheque cheque) {
		em.remove(em.contains(cheque) ? cheque : em.merge(cheque));
	}

	@Override
	public void updateCheque(Cheque cheque) {
		em.merge(cheque);
		
	}

}
