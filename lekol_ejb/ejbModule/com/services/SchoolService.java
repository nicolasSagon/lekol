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
	
	@Override
	public School getSchool(int id) {
		School school = em.find(School.class, id);
		return school;
	}
	
	public List<School> getListSchool() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<School> cq = cb.createQuery(School.class);
        Root<School> rootEntry = cq.from(School.class);
        CriteriaQuery<School> all = cq.select(rootEntry);
        TypedQuery<School> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}
	
	@Override
	public void saveSchool(School school) {
		School l = this.getSchool(school.getId());
		l.setName(school.getName());
		l.setAddress(school.getAddress());
		l.setDirectPhone(school.getDirectPhone());
		l.setDirectorMail(school.getDirectorMail());
		l.setDirectorName(school.getDirectorName());
		l.setSurface(school.getSurface());
		l.setNumberRoom(school.getNumberRoom());
		l.setFax(school.getFax());
		l.setTypeSchool(school.getTypeSchool());
		l.setPhone(school.getPhone());
		em.merge(l);
	}
	
}
