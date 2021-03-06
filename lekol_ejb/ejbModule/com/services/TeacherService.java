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
import com.entities.Teacher;

/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class TeacherService implements TeacherServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public TeacherService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addTeacher(Teacher teacher) {
		em.persist(teacher);
	}
	
	@Override
	public List<Teacher> getListTeacher() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Teacher> cq = cb.createQuery(Teacher.class);
        Root<Teacher> rootEntry = cq.from(Teacher.class);
        CriteriaQuery<Teacher> all = cq.select(rootEntry);
        TypedQuery<Teacher> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}

	@Override
	public void editTeacher(Teacher teacher) {
		Teacher l = em.find(Teacher.class, teacher.getId());
		l.setFirstName(teacher.getFirstName());
		l.setLastName(teacher.getLastName());
		em.merge(l);	
	}

}