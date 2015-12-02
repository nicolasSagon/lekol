package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//import sun.util.logging.resources.logging;

import com.entities.Activity;

/**
 * Session Bean implementation class activityService
 */
@Stateless
@LocalBean
public class ActivityService implements ActivityServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ActivityService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addActivity(Activity activity) {
		em.persist(activity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Activity> getListActivity() {
		return em.createNamedQuery("Activity.findAll").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Activity> getListActivityByClassId(int classId) {
		return em.createNamedQuery("Activity.findAll").getResultList();
	}
	
	@Override
	public Activity getActivity(int id) {
		Activity activity = em.find(Activity.class, id);
		return activity;
	}

	@Override
	public void saveActivity(Activity activity) {
		Activity l = this.getActivity(activity.getId());
		l.setClazz(activity.getClazz());
		l.setEndDate(activity.getEndDate());
		l.setName(activity.getName());
		l.setRoom(activity.getRoom());
		l.setStartDate(activity.getStartDate());
		l.setTeacher(activity.getTeacher());
		em.merge(l);	
	}

}
