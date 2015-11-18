package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import com.entities.School;

/**
 * Session Bean implementation class schoolService
 */
@Stateless
@LocalBean
public class SchoolService implements SchoolServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     * @return 
     */
    public SchoolService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addSchool(School school) {
		em.persist(school);
	}
	
	public List<School> getListSchool() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<School> cq = cb.createQuery(School.class);
        Root<School> rootEntry = cq.from(School.class);
        CriteriaQuery<School> all = cq.select(rootEntry);
        TypedQuery<School> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}
	
}
