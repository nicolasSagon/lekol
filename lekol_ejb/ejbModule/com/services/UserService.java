package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import com.entities.User;

/**
 * Session Bean implementation class userService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     * @return 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addUser(User user) {
		em.persist(user);
		
	}

	@Override
	public List<User> getListUser() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> rootEntry = cq.from(User.class);
        CriteriaQuery<User> all = cq.select(rootEntry);
        TypedQuery<User> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}
	
}
