package com.si.dao;

import com.si.model.Establishment;

public interface EstablishmentDaoInterface {

	//This method fetches primary key for Table from sequence
	int getSeq(String fetchPK);

	//This method Saves Establishment data in establishment table and address table  
	void registerEstablishment(Establishment e);

}