package com.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entities.Cheque;
import com.services.ChequeService;

@ManagedBean
public class ChequeController {

	private Cheque cheque = new Cheque();

	@EJB
	private ChequeService service;
	
	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	public List<Cheque> getListCheque() {
		List<Cheque> listC = service.getListCheque();
		return listC;
	}
	
	public void saveCheque(Cheque cheque) {
		service.addCheque(cheque);
	}
	
}
