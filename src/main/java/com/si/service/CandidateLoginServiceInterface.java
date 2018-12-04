package com.si.service;

import java.util.List;

import com.si.model.Candidate;
import com.si.model.DisplayRecordModel;
import com.si.model.Login;

public interface CandidateLoginServiceInterface {

	Object userLoginValidation(Login login);

	List<DisplayRecordModel> getDrmForCan(Candidate can);

}