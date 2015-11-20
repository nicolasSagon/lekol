package com.services;

import java.util.List;

import javax.ejb.Local;

import com.entities.Cheque;

@Local
public interface ChequeServiceLocal {

	public void addCheque(Cheque cheque);
	public List<Cheque> getListCheque();
	public void deleteCheque(Cheque cheque);
	public void updateCheque(Cheque cheque);
}
