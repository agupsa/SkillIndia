package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dao.EstablishmentSearchDaoInterface;
import com.si.model.Establishment;

@Service
public class SearchEstService {

	@Autowired
    EstablishmentSearchDaoInterface esdao;
	
	public List<Establishment> getEstByName(String establishmentName) {
		return esdao.getEstByName(establishmentName);
		
		
	}

}
