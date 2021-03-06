package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.AdminContrFetchDaoInterface;
import com.si.dao.AdminContrSetStatusDaoInterface;
import com.si.model.Contract;

@Service
@Transactional
public class AdminVerifyContrService implements AdminVerifyContrServiceInterface {

	@Autowired
	AdminContrFetchDaoInterface actrfDao;
	
	@Autowired
	AdminContrSetStatusDaoInterface actrssDao;
	

	@Override
	public List<Contract> getUnverifiedContr() {
		return actrfDao.getUnverifiedContr();
	}


	@Override
	public int setContrVerification(int letterNo, int action) {
		
		return actrssDao.setContrStatus(letterNo,action);
	}

}
