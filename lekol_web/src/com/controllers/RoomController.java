package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import com.entities.Room;
import com.services.RoomService;

@RequestScoped
@ManagedBean
public class RoomController {

	private Room addRoom;
	private Room editRoom;

	@EJB
	private RoomService service;
	
	public RoomController() {
		this.addRoom = new Room();
		this.editRoom = new Room();
	}

	public Room getAddRoom() {
		return addRoom;
	}

	public void setAddRoom(Room addRoom) {
		this.addRoom = addRoom;
	}

	public List<Room> getListRoom() {
		return service.getListRoom();
	}

	public void createRoom(Room room) {
		service.addRoom(room);
		this.addRoom = new Room();
	}

	public void editRoom(Room room) {
		service.saveRoom(room);
		this.editRoom = new Room();
	}
	
	public Room getEditRoom() {
		return editRoom;
	}

	public void setEditRoom(Room editRoom) {
		this.editRoom = editRoom;
	}
	
	public SelectItem convertToSelectItem(Room room) {
		SelectItem item = new SelectItem();
		item.setLabel(room.getName());
		item.setValue(room.getId());
		return item;
	}
	
	public List<SelectItem> convertToListSelectItem(List<Room> lstRoom) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		for(Room room : lstRoom)
			list.add(convertToSelectItem(room));
		return list;
	}

}
