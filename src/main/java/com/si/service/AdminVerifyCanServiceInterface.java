package com.si.service;

import java.util.List;

import com.si.model.Candidate;

public interface AdminVerifyCanServiceInterface {

	String getFilePath(int canRegNo, int fileId);

	List<Candidate> getUnverifiedCan();

	int setCanVerification(int canRegno, int action);

}