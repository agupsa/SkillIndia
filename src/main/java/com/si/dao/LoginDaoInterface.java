package com.si.dao;

import java.util.List;

import com.si.model.DisplayRecordModel;
import com.si.model.Establishment;
import com.si.model.Login;

public interface LoginDaoInterface {

	public Object userLoginValidation(Login login);
	public Object estLoginValidation(Login login);
	public List<DisplayRecordModel> getDrm(Establishment est);
}
