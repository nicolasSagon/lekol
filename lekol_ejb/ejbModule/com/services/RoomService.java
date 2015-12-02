package com.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.entities.Room;

/**
 * Session Bean implementation class levelService
 */
@Stateless
@LocalBean
public class RoomService implements RoomServiceLocal {

	@PersistenceContext(name = "lekol_app")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public RoomService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addRoom(Room room) {
		em.persist(room);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Room> getListRoom() {
		return em.createNamedQuery("Room.findAll").getResultList();
	}
	
	@Override
	public Room getRoom(int id) {
		Room room = em.find(Room.class, id);
		return room;
	}

	@Override
	public void saveRoom(Room room) {
		Room l = this.getRoom(room.getId());
		l.setName(room.getName());
		em.merge(l);	
	}

}
