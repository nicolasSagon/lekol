package com.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Level;

/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class LevelService implements LevelServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public LevelService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addLevel(Level level) {
		em.persist(level);
	}

}
