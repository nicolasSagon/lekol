package com.services;

import java.util.List;

import com.entities.Role;

public interface RoleServiceLocal {

	void addRole(Role role);

	List<Role> getListRole();

	Role getRole(int id);

	void saveRole(Role role);

}
