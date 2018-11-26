package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.EstablishmentDao;
import com.si.model.Candidate;
import com.si.model.Establishment;

@Service
@Transactional
public class EstablishmentRegService {


	@Autowired
	EstablishmentDao edao;
	

	@Transactional
	public void registerCandidate(Establishment e) {
		System.out.println("in service");
		/*e.setPath(saveFiles(e));
		System.out.println("saved file and path");*/
		edao.registerCandidate(e);
	}
}
