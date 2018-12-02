package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.AdminContrFetchDao;
import com.si.dao.AdminContrSetStatusDao;
import com.si.model.Contract;

@Service
@Transactional
public class AdminVerifyContrService {

	@Autowired
	AdminContrFetchDao actrfDao;
	
	@Autowired
	AdminContrSetStatusDao actrssDao;
	
	public List<Contract> getUnverifiedContr() {
		return actrfDao.getUnverifiedContr();
	}

	public int setContrVerification(int letterNo, int action) {
		
		return actrssDao.setContrStatus(letterNo,action);
	}

}
