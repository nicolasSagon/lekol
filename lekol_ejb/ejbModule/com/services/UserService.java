package com.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import com.entities.Role;
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
	 * 
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

	@Override
	public User getUser(int id) {
		User user = em.find(User.class, id);
		return user;
	}

	@Override
	public void saveUser(User user) {
		em.merge(user);
	}
	
	public int signInUser(User user){
		List<User> users = new ArrayList<User>();
		users = em.createNativeQuery("SELECT * FROM USER WHERE mail =" + user.getMail()+ " AND password = "+ user.getPassword(),User.class).getResultList();
		if (users.size() != 0) {
			return users.get(0).getId(); 
		}else{
			return -1;
		}
	}

	public void deleteUser(int id) {
		System.out.println("-----------------------------");
		System.out.println("ID : " + id);
		System.out.println("-----------------------------");
		User user = em.find(User.class, id);
		em.remove(user);
	}
}
