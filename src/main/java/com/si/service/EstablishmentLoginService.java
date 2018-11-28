package com.si.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.LoginDaoInterface;
import com.si.model.Login;

@Service
@Transactional
public class EstablishmentLoginService {
	@Autowired
	LoginDaoInterface ldao;

	public Object EstablishmentLoginValidation(Login login) {
		return ldao.userLoginValidation(login);
	}

}
