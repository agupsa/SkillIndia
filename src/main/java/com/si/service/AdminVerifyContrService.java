package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.si.dao.AdminContrFetchDao;
import com.si.model.Contract;

public class AdminVerifyContrService {

	@Autowired
	AdminContrFetchDao actrfDao;
	
	public List<Contract> getUnverifiedContr() {
		return actrfDao.getUnverifiedContr();
	}

}
