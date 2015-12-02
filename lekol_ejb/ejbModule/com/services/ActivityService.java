package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	public int addActivity(Activity activity) {
		em.persist(activity);
		return activity.getId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Activity> getListActivity() {
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Activity> getAllActivities(int id){
		return em.createNativeQuery("SELECT * from Activity Where classId = " + id, Activity.class).getResultList();
	}
	
	@Override
	public void deleteActivity(int id){
		
		Activity a = em.find(Activity.class, id);
		em.remove(a);
	}

}
