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

import com.entities.Payment;
/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class PaymentService implements PaymentServiceLocal{
	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
	public PaymentService(){
		
	}
	@Override
	public void addPayment(Payment payment) {
		em.persist(payment);
	}
	

	@Override
	public List<Payment> getListPayment() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Payment> cq = cb.createQuery(Payment.class);
        Root<Payment> rootEntry = cq.from(Payment.class);
        CriteriaQuery<Payment> all = cq.select(rootEntry);
        TypedQuery<Payment> allQuery = em.createQuery(all);
        return allQuery.getResultList();
	}
	@Override
	public void deletePayment(Payment payment) {
		em.remove(payment);
		
	}
	@Override
	public void updatePayment(Payment payment) {
		em.merge(payment);
		
	}

}
