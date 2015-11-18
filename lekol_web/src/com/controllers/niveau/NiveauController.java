package com.controllers.niveau;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class NiveauController {

	private Niveau niveau = new Niveau();

	@EJB
	private NiveauService service;
	
	public Niveau getNiveau() {
		return niveau;
	}

	public void setEmployee(Niveau niveau) {
		this.niveau = niveau;
	}

	public void saveEmployee(Niveau niveau) {
		service.addNiveau(niveau);
	}
	
}