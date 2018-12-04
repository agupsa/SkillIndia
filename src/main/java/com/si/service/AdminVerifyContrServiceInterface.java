package com.si.service;

import java.util.List;

import com.si.model.Contract;

public interface AdminVerifyContrServiceInterface {

	List<Contract> getUnverifiedContr();

	int setContrVerification(int letterNo, int action);

}