package com.si.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.si.dao.LoginDaoInterface;
import com.si.model.Candidate;
import com.si.model.DisplayRecordModel;
import com.si.model.Login;

@Service
@Transactional
public class CandidateLoginService {
	@Autowired
	LoginDaoInterface ldao;

	public Object userLoginValidation(Login login) {
		return ldao.userLoginValidation(login);
	}

	public List<DisplayRecordModel> getDrmForCan(Candidate can) {
	
		List<DisplayRecordModel> drm=ldao.getDrmForCan(can);
		return drm;
	}

}
