package com.si.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.LoginDaoInterface;
import com.si.model.Login;

@Service
@Transactional
public class CandidateLoginService {
	@Autowired
	LoginDaoInterface ldao;

	public Object userLoginValidation(Login login) {
		return ldao.userLoginValidation(login);
	}

}
