package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.AdminDaoInterface;
import com.si.model.Login;



@Service
@Transactional
public class AdminLoginService implements AdminLoginServiceInterface {
	@Autowired
	AdminDaoInterface adao;

	
	@Override
	public Boolean adminLogin(Login login) {
		return adao.adminLogin(login);
	}
	

}
