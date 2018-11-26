package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.model.Establishment;
import com.si.dao.EstablishmentSearchDao;

@Service
public class SearchEstService {

	@Autowired
    EstablishmentSearchDao esdao;
	
	public List<Establishment> getEstByName(String establishmentName) {
		return esdao.getEstByName(establishmentName);
		
		
	}

}
