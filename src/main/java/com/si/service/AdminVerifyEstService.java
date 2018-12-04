package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.AdminEstFetchDaoInterface;
import com.si.dao.AdminEstSetStatusDaoInterface;
import com.si.model.Establishment;

@Service
@Transactional
public class AdminVerifyEstService {
	@Autowired
	AdminEstFetchDaoInterface aefDao;
	
	@Autowired
	AdminEstSetStatusDaoInterface aessDao;

	public List<Establishment> getUnverifiedEst() {
		
		return aefDao.getUnverifiedEst();
	}

	public int setEstVerification(int estRegno, int action) {
		
		return aessDao.setEstStatus(estRegno, action);
	}
	
	

}
