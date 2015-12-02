package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import sun.util.logging.resources.logging;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Level> getListLevel() {
		return em.createNamedQuery("Level.findAll").getResultList();
	}
	
	@Override
	public Level getLevel(int id) {
		Level level = em.find(Level.class, id);
		return level;
	}

	@Override
	public void saveLevel(Level level) {
		Level l = this.getLevel(level.getId());
		l.setCycle(level.getCycle());
		l.setName(level.getName());
		em.merge(l);	
	}

}
