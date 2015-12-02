package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entities.Class;

/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class ClassService implements ClassServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ClassService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addClass(Class classe) {
		em.persist(classe);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Class> getListClass() {
		return em.createNamedQuery("Class.findAll").getResultList();
	}
	
	@Override
	public void saveClass(Class classe) {
		Class c = em.find(Class.class, classe.getId());
		c.setLevel(classe.getLevel());
		c.setRoom(classe.getRoom());
		c.setSchool(classe.getSchool());
		c.setTeacher(classe.getTeacher());
		em.merge(c);	
	}

}
