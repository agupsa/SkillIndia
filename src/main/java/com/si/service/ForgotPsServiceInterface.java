package com.si.service;

import com.si.model.Candidate;
import com.si.model.Establishment;

public interface ForgotPsServiceInterface {

	void forgotPassword(Candidate can);

	void forgotPasswordEst(Establishment est);

}