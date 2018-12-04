package com.si.dao;

import java.util.List;

import com.si.model.Establishment;

public interface EstablishmentSearchDaoInterface {

	//This method Fetches search result of establishment 
	List<Establishment> getEstByName(String establishmentName);

}