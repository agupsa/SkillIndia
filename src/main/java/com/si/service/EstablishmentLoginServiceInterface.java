package com.si.service;

import java.util.List;

import com.si.model.DisplayRecordModel;
import com.si.model.Establishment;
import com.si.model.Login;

public interface EstablishmentLoginServiceInterface {

	Object EstablishmentLoginValidation(Login login);

	List<DisplayRecordModel> getDrm(Establishment est);

}