package com.si.dao;

import java.util.List;

import com.si.model.Establishment;

public interface AdminEstFetchDaoInterface {

	// Returns list of establishment that have status set as 'Awaiting Verification' for verification by admin
	List<Establishment> getUnverifiedEst();

}