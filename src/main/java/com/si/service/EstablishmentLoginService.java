package com.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.LoginDaoInterface;
import com.si.model.DisplayRecordModel;
import com.si.model.Establishment;
import com.si.model.Login;

@Service
@Transactional
public class EstablishmentLoginService implements EstablishmentLoginServiceInterface {
	@Autowired
	LoginDaoInterface ldao;

	
	@Override
	public Object EstablishmentLoginValidation(Login login) {
		return ldao.estLoginValidation(login);
	}

	@Override
	public List<DisplayRecordModel> getDrm(Establishment est) {
		
		List<DisplayRecordModel> drm=ldao.getDrm(est);
		return drm;
	}
	
}
