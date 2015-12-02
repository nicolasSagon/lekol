package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import com.entities.Role;
import com.services.RoleService;

@RequestScoped
@ManagedBean
public class RoleController {

	private Role addRole;
	private Role editRole;

	@EJB
	private RoleService service;
	
	public RoleController() {
		this.addRole = new Role();
		this.editRole = new Role();
	}

	public Role getAddRole() {
		return addRole;
	}

	public void setAddRole(Role addRole) {
		this.addRole = addRole;
	}

	public List<Role> getListRole() {
		return service.getListRole();
	}

	public void createRole(Role role) {
		service.addRole(role);
		this.addRole = new Role();
	}

	public void editRole(Role role) {
		service.saveRole(role);
		this.editRole = new Role();
	}
	public Role getEditRole() {
		return editRole;
	}

	public void setEditRole(Role editRole) {
		this.editRole = editRole;
	}
	

	public SelectItem convertToSelectItem(Role role) {
		SelectItem item = new SelectItem();
		item.setLabel(role.getName());
		item.setValue(role.getId());
		return item;
	}
	
	public List<SelectItem> convertToListSelectItem(List<Role> listRole) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		for(Role role : listRole)
			list.add(convertToSelectItem(role));
		return list;
	}

}
