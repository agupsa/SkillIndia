package com.si.dao;

import com.si.model.Candidate;
import com.si.model.Establishment;

public interface ForgotPsDaoInterface {

	//This Method is for Candidate to reset password if they forget it
	void forgotPassword(Candidate can);

	//this method is for Establishment to reset password if they forget it
	void forgotPasswordEst(Establishment est);

}