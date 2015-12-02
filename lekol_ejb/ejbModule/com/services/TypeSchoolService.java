package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import com.entities.TypeSchool;
import com.entities.TypeSchool;
import com.entities.TypeSchool;

/**
 * Session Bean implementation class schoolService
 */
@Stateless
@LocalBean
public class TypeSchoolService implements TypeSchoolServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
	/**
	 * Default constructor.
	 * 
	 * @return
	 */
	public TypeSchoolService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addTypeSchool(TypeSchool typeSchool) {
		em.persist(typeSchool);

	}

	@Override
	public List<TypeSchool> getListTypeSchool() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<TypeSchool> cq = cb.createQuery(TypeSchool.class);
		Root<TypeSchool> rootEntry = cq.from(TypeSchool.class);
		CriteriaQuery<TypeSchool> all = cq.select(rootEntry);
		TypedQuery<TypeSchool> allQuery = em.createQuery(all);
		return allQuery.getResultList();
	}

	@Override
	public void deleteTypeSchool(TypeSchool typeSchool) {
		em.remove(em.contains(typeSchool) ? typeSchool : em.merge(typeSchool));
	}

	@Override
	public void modifyTypeSchool(TypeSchool typeSchool) {
		em.refresh(em.contains(typeSchool) ? typeSchool : em.merge(typeSchool));
	}

	@Override
	public TypeSchool getTypeById(int id) {
		TypeSchool tmp = em.find(TypeSchool.class, id);
		return tmp;
	}

	@Override
	public void saveTypeSchool(TypeSchool typeSchool) {
		TypeSchool l = this.getTypeSchool(typeSchool.getId());
		l.setName(typeSchool.getName());
		em.merge(l);	
	}

	@Override
	public TypeSchool getTypeSchool(int id) {
		TypeSchool TypeSchool = em.find(TypeSchool.class, id);
		return TypeSchool;
	}

}
