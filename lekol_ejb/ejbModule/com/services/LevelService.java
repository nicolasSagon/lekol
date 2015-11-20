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

import sun.util.logging.resources.logging;

import com.entities.Cycle;
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
		/*CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Level> cq = cb.createQuery(Level.class);
        Root<Level> rootEntry = cq.from(Level.class);
        CriteriaQuery<Level> all = cq.select(rootEntry);
        TypedQuery<Level> allQuery = em.createQuery(all);
        return allQuery.getResultList();*/
	}
	
	@Override
	public Level getLevel(int id) {
		Level level = em.find(Level.class, id);
		return level;
	}

	@Override
	public void saveLevel(Level level) {
			em.merge(level);	
	}

}
