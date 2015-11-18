package com.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	
}
