package com.si.service;

import java.util.List;

import com.si.model.Establishment;

public interface AdminVerifyEstServiceInterface {

	List<Establishment> getUnverifiedEst();

	int setEstVerification(int estRegno, int action);

}