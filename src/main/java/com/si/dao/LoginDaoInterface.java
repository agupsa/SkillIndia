package com.si.dao;

import com.si.model.Login;

public interface LoginDaoInterface {

	public Object userLoginValidation(Login login);
	public Object estLoginValidation(Login login);
}
