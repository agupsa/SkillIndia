package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.AdminCanFetchDaoInterface;
import com.si.dao.AdminCanSetStatusDao;
import com.si.model.Candidate;

@Service
@Transactional
public class AdminVerifyCanService {
	
	@Autowired
	AdminCanFetchDaoInterface acfDao;
	
	@Autowired
	AdminCanSetStatusDao acssDao;

	public String getFilePath(int canRegNo, int fileId) {
		
		return acfDao.getFilePath(canRegNo, fileId);
	}
	
	public List<Candidate> getUnverifiedCan() {
		List<Candidate> ucanlst = acfDao.getUnverifiedCan();
		return ucanlst;
	}

	public int setCanVerification(int canRegno, int action) {
		
		
		return acssDao.setCanStatus(canRegno,action);
	}
}
