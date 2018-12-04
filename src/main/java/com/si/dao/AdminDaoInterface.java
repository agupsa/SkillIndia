package com.si.dao;

import com.si.model.Login;

public interface AdminDaoInterface {

	//checks username and password for admin login
	Boolean adminLogin(Login login);

}