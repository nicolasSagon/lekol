package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Room;

@Local
public interface RoomServiceLocal {

	public void addRoom(Room room);

	public List<Room> getListRoom();
	
	public Room getRoom(int id);
	
	public void saveRoom(Room room);
}
