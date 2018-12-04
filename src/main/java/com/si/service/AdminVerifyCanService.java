package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.AdminCanFetchDaoInterface;
import com.si.dao.AdminCanSetStatusInterface;
import com.si.model.Candidate;

@Service
@Transactional
public class AdminVerifyCanService implements AdminVerifyCanServiceInterface {
	
	@Autowired
	AdminCanFetchDaoInterface acfDao;
	
	@Autowired
	AdminCanSetStatusInterface acssDao;


	@Override
	public String getFilePath(int canRegNo, int fileId) {
		
		return acfDao.getFilePath(canRegNo, fileId);
	}
	
	@Override
	public List<Candidate> getUnverifiedCan() {
		List<Candidate> ucanlst = acfDao.getUnverifiedCan();
		return ucanlst;
	}

	@Override
	public int setCanVerification(int canRegno, int action) {
		
		
		return acssDao.setCanStatus(canRegno,action);
	}
}
