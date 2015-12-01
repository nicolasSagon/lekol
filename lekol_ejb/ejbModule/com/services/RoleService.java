package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import sun.util.logging.resources.logging;

import com.entities.Role;

/**
 * Session Bean implementation class roleService
 */
@Stateless
@LocalBean
public class RoleService implements RoleServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public RoleService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addRole(Role role) {
		em.persist(role);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getListRole() {
		return em.createNamedQuery("Role.findAll").getResultList();
		/*CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Role> cq = cb.createQuery(Role.class);
        Root<Role> rootEntry = cq.from(Role.class);
        CriteriaQuery<Role> all = cq.select(rootEntry);
        TypedQuery<Role> allQuery = em.createQuery(all);
        return allQuery.getResultList();*/
	}
	
	@Override
	public Role getRole(int id) {
		Role role = em.find(Role.class, id);
		return role;
	}

	@Override
	public void saveRole(Role role) {
			em.merge(role);	
	}

}
