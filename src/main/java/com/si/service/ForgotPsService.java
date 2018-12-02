package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.ForgotPsDao;
import com.si.model.Candidate;

@Service
@Transactional
public class ForgotPsService {

	@Autowired
	ForgotPsDao fpd;
	
	public void forgotPassword(Candidate can) {
	
		fpd.forgotPassword(can);
			
	}

	
	
	
	
}
